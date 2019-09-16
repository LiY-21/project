package com.example.hello.controller;

import com.example.hello.service.PlatformService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Map;
import org.apache.commons.collections.MapUtils;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @Resource
    private PlatformService service;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
      public String hello(){
        System.out.println("进来了没有");
        Map<String, Object> sets = service.selectAll();

        return MapUtils.getString(sets,"id");
      }

    @RequestMapping(value="/home/page")
    public ModelAndView goHome(){
        System.out.println("go to the home page!");
        ModelAndView mode = new ModelAndView();
        mode.addObject("name", "zhangsan");
        mode.setViewName("index");
        return mode;
    }

    @RequestMapping("/hi")
    public String hi(){
        return "indexs";
    }
}
