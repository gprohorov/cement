package com.pro.cement.controller.web;


import com.pro.cement.model.Camera;
import com.pro.cement.model.Point;
import com.pro.cement.model.ViewPlace;
import com.pro.cement.service.camera.impls.CameraServiceFakeImpl;
import com.pro.cement.service.point.impls.PointServiceFakeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/web/camera")
public class CameraControllerWEB {

    private final CameraServiceFakeImpl cameraServiceFake;
    private final PointServiceFakeImpl pointServiceFake;

    @Autowired
    public CameraControllerWEB(CameraServiceFakeImpl cameraServiceFake
            , PointServiceFakeImpl pointServiceFake) {
        this.cameraServiceFake = cameraServiceFake;
        this.pointServiceFake = pointServiceFake;
    }

    @RequestMapping("/get/list")
    String showAll(Model model) {
        List<Camera> list = cameraServiceFake.getAll();
        model.addAttribute("list", list);
        return "cameraList";

    }

    @RequestMapping("/get/{id}")
    String show(@PathVariable("id") String id) {
        return null;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String createGet(Model model) {
        Camera camera = new Camera();
        Point point = new Point();
        List view = Arrays.asList(ViewPlace.values());
        model.addAttribute("view", view);
        model.addAttribute("Camera", camera);
        model.addAttribute("Point", point);
        return "/cameraAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPost(@ModelAttribute("Camera") Camera camera
            ,@ModelAttribute("Point") Point point){
        camera.setPoint(pointServiceFake.create(point));
        cameraServiceFake.create(camera);
        return "redirect:/web/camera/get/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id")String id){
        cameraServiceFake.delete(id);
        return "redirect:/web/camera/get/list";
    }

}
