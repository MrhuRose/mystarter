package com.rose.hello.service;

import com.rose.hello.properties.HelloPorperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ConditionalOnWebApplication
@Configuration
@EnableConfigurationProperties(HelloPorperties.class)
public class HelloAutoConfiguration {

    @Autowired
    HelloPorperties helloPorperties;

    @Bean
    public HelloService getHelloService() {
        HelloService helloService = new HelloService();
        helloService.setHelloPorperties(helloPorperties);
        return helloService;
    }
}
