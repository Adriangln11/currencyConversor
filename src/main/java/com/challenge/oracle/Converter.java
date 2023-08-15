package com.challenge.oracle;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Converter {
    static Map<String, Double> currencies = new HashMap<>();

    public Converter () {
        currencies.put("USD", 17.06);
        currencies.put("EUR", 18.74);
        currencies.put("ARS", 0.06);
        currencies.put("JPY", 0.11);
        currencies.put("RUB", 0.17);
        currencies.put("BRL", 3.48);
        currencies.put("MXN", 1.00);
    };

    public void init(){
        String dialog1 = (JOptionPane.showInputDialog(
                null,
                "Select currency to convert",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                currencies.keySet().toArray(),
                "Currency")).toString();

        Double toConvert = Double.parseDouble(JOptionPane.showInputDialog("Amount"));


        String dialog2 = (JOptionPane.showInputDialog(
                null,
                "Select the converted currency",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                currencies.keySet().toArray(),
                "Currency")).toString();


        double value1 = currencies.get(dialog1);
        double value2 = currencies.get(dialog2);
        double result = (value1 * toConvert) / value2;
        System.out.println(result);

        JOptionPane.showMessageDialog(null, "The result is " + result);


    };


}
