package com.lunatech.springworkshop.controller;

import com.lunatech.springworkshop.bean.ApplicationBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@Slf4j
public class AboutController {

    @Autowired
    private ApplicationBean applicationBean;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApplicationBean getAppInfo(){

        log.info("Entering getAppInfo");
        return this.applicationBean;
    }


}
