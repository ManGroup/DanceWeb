package jp.co.dreamarts.common;


import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.plugin.druid.DruidStatViewHandler;
import jp.co.dreamarts.app.ViewController;
import jp.co.dreamarts.app.user.User;
import jp.co.dreamarts.app.user.UserController;

/**
 * API引导式配置
 */
public class AppConfig extends JFinalConfig {
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		// 加载少量必要配置，随后可用getProperty(...)获取值
		loadPropertyFile("config.txt");
		me.setDevMode(getPropertyToBoolean("devMode", false));

	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {

        me.add("/", AppController.class);
        me.add("/view", ViewController.class);

        me.add("/user", UserController.class);
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {

        DruidPlugin dp = new DruidPlugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password"));
        dp.addFilter(new StatFilter());
        WallFilter wall = new WallFilter();
        wall.setDbType("mysql");
        dp.addFilter(wall);
        me.add(dp);

        // 配置ActiveRecord插件
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        arp.addMapping("s_s_user", User.class);
        me.add(arp);

    }
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
        DruidStatViewHandler dvh =  new DruidStatViewHandler("/druid");
        me.add(dvh);
    }
	
	/**
	 * 建议使用 JFinal 手册推荐的方式启动项目
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 */
	public static void main(String[] args) {

		JFinal.start("src/main/webapp", 4001, "/", 5);
	}
}
