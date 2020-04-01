package com.lunatech.springworkshop.controller;

import com.lunatech.springworkshop.model.Office;
import com.lunatech.springworkshop.service.OfficeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offices")
public class OfficeController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OfficeService officeService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Office> getOffices(){

        log.info("Entering getOffices");
        return this.officeService.getAll();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Office getOffice(@PathVariable("id") String id){

        log.info(String.format("Entering getOffice with id %s", id));
        return this.officeService.getById(id);
    }
    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addOffice(@RequestBody Office office){
        log.info("Entering addOffice");
        this.officeService.add(office);
    }
}
