package com.pro.cement.controller.rest;


import com.pro.cement.model.Processing;
import com.pro.cement.service.processing.impls.ProcessingServiceFakeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/processing")
public class ProcessingControllerREST {

    @Autowired
    ProcessingServiceFakeImpl service;

    @RequestMapping("/get/list")
    List<Processing> getAll() {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Processing get(@PathVariable("id") String id) {
        return service.get(id);
    }

    @RequestMapping("/success")
    String success() throws IOException {
        return service.identifyOne("c1.png");
    }

}
