package demo;

import com.jfinal.core.Controller;

/**
 * Created by jackl on 2016/5/11.
 */
public class HelloController extends Controller{
public void index(){
    renderText("欢迎来到Jfinal");
}
}
