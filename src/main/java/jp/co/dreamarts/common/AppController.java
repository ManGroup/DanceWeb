package jp.co.dreamarts.common;

import com.jfinal.core.Controller;

/**
 * Created by Antony on 14-6-10.
 */
public class AppController extends Controller {

    public void index() {
        setAttr("root","");
        render("/index.html");
    }

    public void test(){

        render("/ftl/common/index.html");
    }
}
