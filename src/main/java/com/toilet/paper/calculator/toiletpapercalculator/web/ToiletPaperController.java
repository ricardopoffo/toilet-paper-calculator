package com.toilet.paper.calculator.toiletpapercalculator.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toilet.paper.calculator.toiletpapercalculator.records.Calculation;
import com.toilet.paper.calculator.toiletpapercalculator.service.ToiletPaperCalculatorService;

@RestController
public class ToiletPaperController {

    private final ToiletPaperCalculatorService toiletPaperCalculatorService;

    public ToiletPaperController(ToiletPaperCalculatorService toiletPaperCalculatorService){
        this.toiletPaperCalculatorService = toiletPaperCalculatorService;
    }

    @GetMapping("/toilet-paper-calculator")
    public Calculation getMethodName(
        @RequestParam(name = "price") double price, 
        @RequestParam(name = "rolls") int rolls, 
        @RequestParam(name = "rollLen") int rollLen,
        @RequestParam(name = "name", required = false, defaultValue = "No Name") String name) {
        
        return toiletPaperCalculatorService.calcutatePricePerUnitInPackage(rolls, rollLen, price, name);
    }
    
}
