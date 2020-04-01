package com.lunatech.springworkshop.bean;

public class ApplicationBean {

    private String instance, version;

    public ApplicationBean(String instance, String version) {
        this.instance = instance;
        this.version = version;
    }

    public String getInstance() {
        return instance;
    }

    public String getVersion() {
        return version;
    }
}
