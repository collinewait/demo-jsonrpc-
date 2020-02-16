package com.example.democlient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    @Autowired
    private CalculatorAPI calculatorAPI;

    public int add(int a, int b) {
        return calculatorAPI.add(a, b);
    }
}
