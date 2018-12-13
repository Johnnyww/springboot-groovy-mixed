package com.wmd.test.springboot.groovy.mixed.domain;

import java.io.Serializable;

/**
 * @Author: wengmd
 * @Date: 18-12-13 下午10:02
 */
public class HelloDataBean implements Serializable {
    private static final long serialVersionUID = 1774367862324065821L;

    private String springboot;
    private String groovy;
    private String hello;
    private String world;

    public String getSpringboot() {
        return springboot;
    }

    public void setSpringboot(String springboot) {
        this.springboot = springboot;
    }

    public String getGroovy() {
        return groovy;
    }

    public void setGroovy(String groovy) {
        this.groovy = groovy;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
