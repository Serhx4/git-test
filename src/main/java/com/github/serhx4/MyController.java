package com.github.serhx4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String getMyView() {
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }
 @RequestMapping("showDetails")
    public String showEmpDetails(){
        return  "show-emp-details-view";
    }
}
