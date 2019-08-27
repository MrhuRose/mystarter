package com.rose.hello.service;

import com.rose.hello.properties.HelloPorperties;

public class HelloService {

    HelloPorperties helloPorperties;

    public HelloPorperties getHelloPorperties() {
        return helloPorperties;
    }

    public void setHelloPorperties(HelloPorperties helloPorperties) {
        this.helloPorperties = helloPorperties;
    }

    public String sysHello(String name) {
        return helloPorperties.getPrefix() + "-" + name + "-" + helloPorperties.getSuffix();
    }
}
