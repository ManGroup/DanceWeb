package jp.co.dreamarts.app;

import com.jfinal.core.Controller;
import jp.co.dreamarts.app.user.User;

import java.util.List;

/**
 * Created by Antony on 14-6-12.
 */
public class ViewController extends Controller {

    public void list() {

        List<User> userList = User.dao.getUserList();
        setAttr("userList", userList);
        render("user_list.ftl");
    }

    public void menuJson () {

        render("json/menuJson.ftl");
    }
    public void user() {

        render("user.ftl");
    }
    public void portal() {

        render("portal.ftl");
    }

}
