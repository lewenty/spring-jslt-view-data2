package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by levent.yildiz on 14.09.2014.
 */

@Controller
public class ListController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index"); // index sayfasına gider

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("adi", "Levent");
        hashMap.put("soyadi", "YILDIZ");

        ArrayList bilgiler = new ArrayList();
        bilgiler.add(hashMap);

        mv.addObject("bilgiler", bilgiler);

        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("phyton");

        mv.addObject("diller", list);

        return mv;
    }

}
