package com.reljicd.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomErrorController {

    @RequestMapping("/error")
    public ModelAndView handleError(Model model) {
        // Add additional information to the model, like error details
        model.addAttribute("error", "An unexpected error occurred.");
        return new ModelAndView("error");  // This refers to the error.jsp or error.html page
    }

    @GetMapping("/403")
    public ModelAndView error403() {
        return new ModelAndView("403");  // Custom page for 403 errors
    }

    @GetMapping("/404")
    public ModelAndView error404() {
        return new ModelAndView("404");  // Custom page for 404 errors
    }

    // You can implement more error pages like 500 etc. as needed
}
