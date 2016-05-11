package com.demo;

import com.jfinal.core.Controller;

/**
 * Created by jackl on 2016/5/11.
 */
public class Indexcontroller extends Controller{
    public void index(){
        renderText("Jetty Index");
    }

}
