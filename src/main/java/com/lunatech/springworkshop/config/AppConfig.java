package com.lunatech.springworkshop.config;


import com.lunatech.springworkshop.bean.ApplicationBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class AppConfig {

    @Value("${application.instance}")
    private String instance;
    @Value("${application.version}")
    private String version;

    @Bean
    public ApplicationBean applicationBean(){
        return new ApplicationBean(instance, version);
    }

    @PostConstruct
    public void init(){
        if(instance.equals("")) instance = "instance-nl-1";
        if(version.equals("")) version = "version-1-springworkshop";
    }

    @PreDestroy
    public void destroy(){
        // When we need to perform some action before shutdown the app.
    }
}
