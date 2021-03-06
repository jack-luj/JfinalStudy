package com.demo;

import com.jfinal.config.*;
import com.jfinal.plugin.redis.RedisPlugin;

/**
 * Created by jackl on 2016/5/11.
 */
public class DemoConfig extends JFinalConfig{

    public void configConstant(Constants me) {
    me.setDevMode(true);
        me.setJsonDatePattern("yyyy-MM-dd HH:mm:ss");
    }

    public void configRoute(Routes me) {
        me.add("/hello",HelloController.class);
        me.add("/",IndexController.class);
    }
     public void configPlugin(Plugins me) {
         RedisPlugin bbsRedis = new RedisPlugin("bbs", "localhost");
         me.add(bbsRedis);

    }
     public void configInterceptor(Interceptors me) {

    }
     public void configHandler(Handlers me) {

    }
}
