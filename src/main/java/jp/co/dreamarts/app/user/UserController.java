package jp.co.dreamarts.app.user;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import jp.co.dreamarts.bean.ResultExecute;
import jp.co.dreamarts.bean.ResultPage;

/**
 * Created by Antony on 14-6-11.
 */
public class UserController extends Controller {

    public void list() {

        String id = getRequest().getSession().getId();

        System.out.println("Session Id :" + id);

        Integer page = getParaToInt("page");

        Page<User> userList = User.dao.getPage(page);

        ResultPage resultPage = new ResultPage();
        resultPage.setRows(userList.getList());
        resultPage.setTotal(userList.getTotalRow());

        renderJson(resultPage);
    }

    public void save() {


        Integer id = getParaToInt("id");

        User model = getModel(User.class);

        model.set("username", getPara("username"));
        model.set("password", getPara("password"));

        if (id != null && id > 0) {
            model.set("id", id);
            model.update();
        } else {
            model.save();
        }

        ResultExecute execute = new ResultExecute();
        execute.setCode(1);
        execute.setMsg("添加成功");
        renderJson(execute);
    }

    public void delete() {

        for (Integer ids : getParaValuesToInt("ids")) {
            User.dao.deleteById(ids);
        }

        ResultExecute execute = new ResultExecute();
        execute.setCode(1);
        execute.setMsg("删除成功");
        renderJson(execute);
    }

    public void update() {

        User model = getModel(User.class);
        model.set("username", getPara("username"));
        model.set("password", getPara("password"));
        model.update();

        ResultExecute execute = new ResultExecute();
        execute.setCode(1);
        execute.setMsg("修改成功");
        renderJson(execute);
    }
}
