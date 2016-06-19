package com.mvc.app.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootstrapController {

   Log logger = LogFactory.getLog(BootstrapController.class);

    @RequestMapping("/")
    public String home() {
        logger.info("from index action");
        return "home";
    }

    @RequestMapping("/staticResource")
    public String staticResource() {
        logger.info("from staticResource action");
        return "staticResource";
    }

    @RequestMapping("/appindex")
    public String appindex() {
        logger.info("from appindex");
        return "appindex";
    }

    @RequestMapping("/createException")
    public String createException() {
        logger.info("from appindex");
        int x = 10/0;
        return "home";
    }

}
