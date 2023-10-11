package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {
    private CalculatorUI calculatorUI;
    @ParameterizedTest
    @CsvSource({"-5,-999.9,+,-1004.9", "-5,0,+,-5", "-5, 666,+,661",
            "0,-999.9,+,-999.9", "0,0,+,0", "0,666,+,666",
            "5000,-999.9,+,4000.1","5000,0,+,5000","5000,666,+,5666"})
    public void testAddition(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    @ParameterizedTest
    @CsvSource({"-77.7,-9,-,-68.7", "-77.7,0,-,-77.7", "-77.7, 666,-,-743.7",
            "0,-9,-,9", "0,0,-,0", "0, 666,-,-666",
            "5,-9,-,14", "5,0,-,5", "5, 666,-,-661", "0, 25, √, 5"})
    public void testSubtraction(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

}
