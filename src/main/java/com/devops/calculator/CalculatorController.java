package com.devops.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate/")
public class CalculatorController {

    @Autowired
    private Calculator calculator;
    @GetMapping("addition")
    public int getAddition(@RequestParam(defaultValue = "4") int num1, @RequestParam(defaultValue = "2") int num2)
    {
        return calculator.add(num1, num2);
    }

    @GetMapping("subtraction")
    public int getsubtraction(@RequestParam(defaultValue = "4") int num1, @RequestParam(defaultValue = "2") int num2)
    {
        return calculator.subtract(num1, num2);
    }
    @GetMapping("multiplication")
    public int getMultiplication(@RequestParam(defaultValue = "4") int num1, @RequestParam(defaultValue = "2") int num2)
    {
        return calculator.multiply(num1, num2);
    }
    @GetMapping("division")
    public int getDivision(@RequestParam(defaultValue = "4") int num1, @RequestParam(defaultValue = "2") int num2)
    {
        return calculator.divide(num1, num2);
    }


}
