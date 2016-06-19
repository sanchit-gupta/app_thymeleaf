package com.mvc.app.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * By default it look for /error page inside template folder. But we can override the default conf and show this customErrorPage.html
 */
@Controller
public class CustomErrorController implements ErrorController {
    /**
     * Returns the path of the error page.
     *
     * @return the error path
     */
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String list(Model model) {
        model.addAttribute("pageTitle", "Custom Error page, action /error is being called");
        return "/error/customErrorPage";
    }
}
