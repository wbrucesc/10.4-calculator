package com.will.calculator104.controllers;

import com.will.calculator104.Models.MathOp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String index(@RequestParam("firstNum") String firstNum,
                        @RequestParam("operator") String operator,
                        @RequestParam("secondNum") String secondNum,
                        Model model) {

        MathOp runCalc = new MathOp(firstNum, operator, secondNum);
        Double answer = runCalc.calculate(firstNum, operator, secondNum);

        model.addAttribute("showCalc", String.format("%s %s %s", firstNum, operator, secondNum));
        model.addAttribute("showResult", answer);
        return "index";
    }

}
