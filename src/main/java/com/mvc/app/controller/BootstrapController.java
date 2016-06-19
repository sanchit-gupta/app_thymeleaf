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
}
