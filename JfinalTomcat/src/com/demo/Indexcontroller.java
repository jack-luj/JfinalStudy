package com.demo;

import com.jfinal.core.Controller;

import java.util.Date;

/**
 * Created by jackl on 2016/5/11.
 */
public class IndexController extends Controller{
    public void index(){
        renderText("this is index page   ");
    }

    public void getUser(){
        User u=new User();
        u.setId(System.currentTimeMillis());
        u.setUsername("张三");
        u.setPassword("123456");
        u.setPhone("13012345678");
        u.setBirth(new Date());
        renderJson(u);
    }
    public void getTime(){
       renderJson(new Date().getTime());
    }
}
