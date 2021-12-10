package io.quind.calculatorBack.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import io.quind.calculatorBack.operations.CalculatorOperations;

@RestController

public class CalculatorController {

    @RequestMapping("/add")
    public static int getUrlAddition(
        @RequestParam(value="number1", defaultValue = "0") int number1,
        @RequestParam(value= "number2", defaultValue = "0") int number2) {
        CalculatorOperations instanceCalculatorOperations = new CalculatorOperations();
        return instanceCalculatorOperations.addTwoNumbers(number1, number2);
    }
}