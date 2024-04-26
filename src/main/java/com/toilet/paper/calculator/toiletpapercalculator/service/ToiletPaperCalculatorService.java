package com.toilet.paper.calculator.toiletpapercalculator.service;

import org.springframework.stereotype.Service;

import com.toilet.paper.calculator.toiletpapercalculator.records.Calculation;

@Service
public class ToiletPaperCalculatorService {

    public Calculation calcutatePricePerUnitInPackage(int unitsPerPackage, int unitCount, double packagePrice, String name){
        name = name != null ? name : "No name";
        double calculus = packagePrice / (unitCount * unitsPerPackage);
        return new Calculation(name, packagePrice, unitCount, unitsPerPackage, calculus);
    }
}
