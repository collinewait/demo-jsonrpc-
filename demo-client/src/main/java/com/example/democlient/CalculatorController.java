package com.example.democlient;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("{a}/{b}")
    public int add(@PathVariable(value = "a") int a, @PathVariable(value = "b") int b) {
        return calculatorService.add(a, b);
    }
}
