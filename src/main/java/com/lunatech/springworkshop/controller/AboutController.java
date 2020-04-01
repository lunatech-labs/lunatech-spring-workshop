package com.lunatech.springworkshop.controller;

import com.lunatech.springworkshop.bean.ApplicationBean;
import com.lunatech.springworkshop.model.Office;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/about")
public class AboutController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ApplicationBean applicationBean;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApplicationBean getAppInfo(){

        log.info("Entering getAppInfo");
        return this.applicationBean;
    }


}
