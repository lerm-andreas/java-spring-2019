package com.websystique.springmvc.controller;

import com.websystique.springmvc.model.DummyModel;
import com.websystique.springmvc.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private DummyService dummyService;

    @RequestMapping(value = { "/dummytest" }, method = RequestMethod.GET)
    public String getDummy(ModelMap modelMap){

        List<DummyModel> dummyModels = dummyService.findAll();

        modelMap.addAttribute("dummyModels",dummyModels);

        return "printing";
    }


}
