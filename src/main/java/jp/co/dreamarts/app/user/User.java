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


    private int id;
    private int valid;
    private String username;
    private String updateby;

    public List<User> getUserList() {

        return User.dao.find("select * from s_user");
    }

    public Page<User> getPage(int page) {

        return User.dao.paginate(page, 20, "select * ", "from s_s_user order by id desc");
    }

    public int saveUser() {

        User.dao.save();
        return 1;
    }

    public static User getDao() {
        return dao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }
}
