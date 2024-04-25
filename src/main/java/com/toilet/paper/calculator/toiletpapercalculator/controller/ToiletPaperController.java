package com.toilet.paper.calculator.toiletpapercalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toilet.paper.calculator.toiletpapercalculator.records.Calculation;


@RestController
public class ToiletPaperController {

    @GetMapping("/toilet-paper-calculator")
    public Calculation getMethodName(
        @RequestParam(name = "price") double price, 
        @RequestParam(name = "rolls") int rolls, 
        @RequestParam(name = "rollLen") int rollLen,
        @RequestParam(name = "name", required = false, defaultValue = "No Name") String name) {
        
        double calculus = price / (rollLen * rolls);
        Calculation calculation = new Calculation(name, price, rolls, rollLen, calculus);

        return calculation;
    }
    
}
