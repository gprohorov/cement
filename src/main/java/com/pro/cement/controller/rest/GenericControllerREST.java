package com.pro.cement.controller.rest;


import com.pro.cement.model.Generic;
import com.pro.cement.service.IGenericService;
import com.pro.cement.service.generic.impls.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/generic")
public class GenericControllerREST {

    @Autowired
    GenericServiceImpl service;

    @RequestMapping("/get/list")
    List<Generic> getAll() {
        return service.getAll();
    }

    @RequestMapping("/get/{id}")
    Generic get(@PathVariable("id") String id) {
        return service.get(id);
    }

}
