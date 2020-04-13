package com.pro.cement.controller.web;


import com.pro.cement.model.Cadr;
import com.pro.cement.model.Processing;
import com.pro.cement.service.processing.impls.ProcessingServiceFakeImpl;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/web/processing")
public class ProcessingControllerWEB {

    private final ProcessingServiceFakeImpl processingServiceFake;

    public ProcessingControllerWEB(ProcessingServiceFakeImpl processingServiceFake) {
        this.processingServiceFake = processingServiceFake;
    }

    @RequestMapping("/get/list")
    String showAll(Model model) throws TesseractException, IOException {
        List<Processing> list = processingServiceFake.getAll();
        model.addAttribute("list", list);
        return "processingList";

    }

    @RequestMapping("/get/{id}")
    String show(@PathVariable("id") String id) {
        return null;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String createGet(Model model) {

        return "/processingAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPost(@ModelAttribute("Processing") Processing processing){

        return "redirect:/web/processing/get/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id")String id){
        processingServiceFake.delete(id);
        return "redirect:/web/processing/get/list";
    }

}
