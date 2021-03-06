package com.pro.cement.controller.web;


import com.pro.cement.model.Point;
import com.pro.cement.service.point.interfaces.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/web/point")
public class PointControllerWEB {

    @Autowired
    IPointService service;

    @RequestMapping("/get/list")
    String showAll(Model model) {
        
        List<Point> list = service.getAll();
        model.addAttribute("list", list);
        return "pointList";
        
    }

    @RequestMapping("/get/{id}")
    String show(@PathVariable("id") String id) {
        return null;
    }

}
