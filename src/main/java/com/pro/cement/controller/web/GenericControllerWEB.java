package com.pro.cement.controller.web;


import com.pro.cement.model.Generic;
import com.pro.cement.service.generic.impls.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/web/generic")
public class GenericControllerWEB {

    @Autowired
    GenericServiceImpl service;

    @RequestMapping("/get/list")
    String showAll(Model model) {

        List<Generic> list = service.getAll();
        model.addAttribute("list", list);
        return "genericList";

    }

    @RequestMapping("/get/{id}")
    String show(@PathVariable("id") String id) {
        return null;
    }

}
