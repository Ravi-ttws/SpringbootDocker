package com.springbootdcoker;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.azure.spring.cloud.feature.management.FeatureManager;


@Controller
public class HelloController {

    @Autowired
    private FeatureManager featureManager;

    @GetMapping("/featureflag")
    public String mainWithParam(Model model) {
        model.addAttribute("datafromcontroller", featureManager.isEnabled("FeatureFlagAdminTab"));  //true
        return "welcome";  //welcome.html
    }
}