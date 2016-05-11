package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by jackl on 2016/5/11.
 */
public class IndexController extends Controller{
    public void index(){
        renderText("this is index page   ");
    }
}
