package com.pro.cement.controller.rest;


import com.pro.cement.model.Cadr;
import com.pro.cement.model.Generic;
import com.pro.cement.service.cadr.impls.CadrServiceFakeImpl;
import com.pro.cement.service.generic.impls.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/cadr")
public class CadrControllerREST {

    @Autowired
    CadrServiceFakeImpl service;

    @RequestMapping("/get/list")
    List<Cadr> getAll() throws IOException {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Cadr get(@PathVariable("id") String id) {
        return service.get(id);
    }

}
