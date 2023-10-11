package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private CalculatorUI calculatorUI;

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"-5,-999.9,+,-1004.9", "-5,0,+,-5", "-5, 666,+,661",
            "0,-999.9,+,-999.9", "0,0,+,0", "0,666,+,666",
            "5000,-999.9,+,4000.1","5000,0,+,5000","5000,666,+,5666"})
    public void testAddition(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"-77.7,-9,-,-68.7", "-77.7,0,-,-77.7", "-77.7, 666,-,-743.7",
            "0,-9,-,9", "0,0,-,0", "0, 666,-,-666",
            "5,-9,-,14", "5,0,-,5", "5, 666,-,-661", "0, 25, √, 5"})
    public void testSubtraction(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"-100,0,*,0", "0, 591,*,0", "777, -47,*,-36519",
            "-50, -40,*,2000", "70,3,*,210"})
    public void testMultiplication(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator),0.000001);
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"-15,-32,/,0.46875", "0, 0,/,NaN", "666, 333,/,2",
            "-15, 333,/,-0.04504504504", "0,-15,/,0", "666, 0, /, Infinity"})
    public void testDivision(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator),0.000001);
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"-15, -30, %, -15", "-15, 0, %, NaN", "-15, 2, %, -1",
            "0, -30, %, 0", "0, 0, %, NaN",
            "666, -30, %, 6", "666, 0, %, NaN", "666, 2, %, 0"})
    public void testModulo(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"-5.5, -2, ^, 0.03305785123966942","-5.5, -3, ^, -0.006010518407212622", "-5.5, 0, ^, 1", "-5.5, 4, ^, 915.0625", "-5.5, 5, ^, -5032.84375",
            "0, -2, ^, Infinity", "0, -3, ^, Infinity", "0, 0, ^, 1", "0, 4, ^, 0", "0, 5, ^, 0",
            "6, -2, ^, 0.027777777777777776", "6, -3, ^, 0.004629629629629629", "6, 0, ^, 1", "6, 4, ^, 1296", "6, 5, ^, 7776"})
    public void testPower(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"0, -11, √, NaN", "0, 0, √, 0", "0, 23, √, 4.795831523312719"})
    public void testSquareRoot(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @ParameterizedTest
    @CsvSource({"0, -5, l, NaN", "0, 0, l, -Infinity", "0, 10, l, 2.302585092994046", "0, 1, l, 0"})
    public void testLog(double firstNumber, double secondNumber, char operator, double expectedResult){
        calculatorUI = new CalculatorUI();
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @Test
    void testModeButtonsVisibility() {
        CalculatorUI calculatorUI = new CalculatorUI();

        calculatorUI.comboCalculatorType.setSelectedItem("Scientific");
        assertTrue(calculatorUI.btnRoot.isVisible());
        assertTrue(calculatorUI.btnPower.isVisible());
        assertTrue(calculatorUI.btnLog.isVisible());

        calculatorUI.comboCalculatorType.setSelectedItem("Standard");
        assertFalse(calculatorUI.btnRoot.isVisible());
        assertFalse(calculatorUI.btnPower.isVisible());
        assertFalse(calculatorUI.btnLog.isVisible());
    }

    /*Copyright (C) 2023 Supasan Liengchaisiri - All Rights Reserved
     * You may use, distribute and modify this code under the terms of the MIT license.
     */
    @Test
    public void testBackButton() {
        CalculatorUI calculatorUI = new CalculatorUI();
        calculatorUI.inputScreen.setText("3");
        calculatorUI.btnBack.doClick();
        assertEquals("0", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("123");
        calculatorUI.btnBack.doClick();
        assertEquals("12", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("-3");
        calculatorUI.btnBack.doClick();
        assertEquals("-", calculatorUI.inputScreen.getText());

        calculatorUI.inputScreen.setText("-12");
        calculatorUI.btnBack.doClick();
        assertEquals("-1", calculatorUI.inputScreen.getText());
    }
}
