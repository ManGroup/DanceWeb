package jp.co.dreamarts.common;

import com.jfinal.core.Controller;

/**
 * Created by Antony on 14-6-10.
 */
public class AppController extends Controller {

    public void index() {
        System.out.println("good  job 3");
        render("/index.html");
    }

    public void test(){

        System.out.println("good  job test1111111122222");
        render("/index.html");
    }
}
