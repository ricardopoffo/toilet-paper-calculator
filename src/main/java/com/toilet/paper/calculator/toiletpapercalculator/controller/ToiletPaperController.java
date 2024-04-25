package com.toilet.paper.calculator.toiletpapercalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toilet.paper.calculator.toiletpapercalculator.records.Calculation;


@RestController
public class ToiletPaperController {

    @GetMapping("/toilet-paper-calculator")
    public Calculation getMethodName() {
        String name = "Fofinho";
        double price = 21.99;
        int rolls = 12;
        int rollLen = 20;
        double calculus = price / (rollLen * rolls);
        Calculation calculation = new Calculation(name, price, rolls, rollLen, calculus);

        return calculation;
    }
    
}
