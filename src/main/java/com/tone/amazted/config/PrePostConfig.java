package com.tone.amazted.config;

import com.tone.amazted.service.BeanWayService;
import com.tone.amazted.service.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tone.amazted")
public class PrePostConfig {
    @Bean(initMethod="init",destroyMethod ="destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
