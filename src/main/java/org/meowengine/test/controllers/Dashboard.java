package org.meowengine.test.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/dashboard")
public class Dashboard {

    @Value("${app.name}")
    String appName;

    @Value("${app.version}")
    String appVersion;

    @ModelAttribute
    public void base(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("appVersion", appVersion);
    }

    @GetMapping
    public String projectSelector(Model model) {
        log.info("Entered into DashboardController#projectSelector");

        return "dashboard";
    }

}
