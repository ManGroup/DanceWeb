package jp.co.dreamarts.app.user;

import com.jfinal.config.JFinalConfig;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.activerecord.Page;
import jp.co.dreamarts.common.AppConfig;
import jp.co.dreamarts.common.AppServletContext;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.ServletContext;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Antony on 14-6-11.
 */
public class UserTest {

    private User user = new User();

    @Before
    public void setUp() throws Exception {
        try {
            Method method = JFinal.me().getClass().getDeclaredMethod("init", JFinalConfig.class, ServletContext.class);
            method.setAccessible(true);
            method.invoke(JFinal.me(), new AppConfig(), new AppServletContext());
        } catch (Exception e) {

        }
    }

    @Test
    public void testGetUserList() throws Exception {
        List<User> userList = user.getUserList();
        System.out.println(userList);
    }

    @Test
    public void testPage() throws Exception {
        Page<User> page = user.getPage();
        System.out.println(page);

    }
}
