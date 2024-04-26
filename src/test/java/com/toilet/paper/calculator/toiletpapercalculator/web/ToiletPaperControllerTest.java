package com.toilet.paper.calculator.toiletpapercalculator.web;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.toilet.paper.calculator.toiletpapercalculator.records.Calculation;
import com.toilet.paper.calculator.toiletpapercalculator.service.ToiletPaperCalculatorService;

@WebMvcTest(ToiletPaperController.class)
public class ToiletPaperControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ToiletPaperCalculatorService service;

    @Test
    void calculatorShouldReturnValidStatusAndStringCalculation() throws Exception{
        Calculation calculation = new Calculation("Duetto", 24.99, 18, 30, 1.22);
        when(service.calcutatePricePerUnitInPackage(18, 30, 24.99, "Duetto"))
            .thenReturn(calculation);

        this.mockMvc.perform(get("/toilet-paper-calculator?price=24.99&rolls=18&rollLen=30&name=Duetto"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("calculation")));
    }
}
