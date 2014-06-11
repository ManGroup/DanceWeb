package jp.co.dreamarts.app.user;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

import java.util.List;

/**
 * Created by Antony on 14-6-11.
 */
@SuppressWarnings("serial")
public class User extends Model<User> {

    public static final User dao = new User();

    public static final String ID = "id";
    public static final String USERNAME = "username";

    public List<User> getUserList() {

        List<User> users = User.dao.find("select * from s_user");
        return users;
    }

    public Page<User> getPage() {

        return User.dao.paginate(1, 10, "select * ", "from s_user");
    }
}
