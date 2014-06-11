package jp.co.dreamarts.app.user;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import jp.co.dreamarts.bean.Result;

import java.util.List;

/**
 * Created by Antony on 14-6-11.
 */
public class UserController extends Controller {

    public void index() {

    }

    public void list() {

        List<User> userList = User.dao.getUserList();
        setAttr("userList", userList);
        render("user_list.ftl");
    }

    public void testJson() {

        Page<User> userList = User.dao.getPage();
        Result result = new Result();
        result.setV("1.0");
        result.setData(userList);
        renderJson(result);
    }

}
