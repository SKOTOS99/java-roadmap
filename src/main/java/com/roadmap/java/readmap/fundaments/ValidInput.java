package com.roadmap.java.readmap.fundaments;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidInput {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número o palabra: ");
        String value = scanner.nextLine();
        System.out.println("El resultado es: " + valueType(value));
        scanner.close();


    }
    public static String valueType(String value) {
        if (isInteger(value)) {
            return String.valueOf(Integer.parseInt(value) * 2);
        }else if (isDecimal(value)) {
            return String.valueOf(roundToTwoDecimals(Double.parseDouble(value)));
        }
        else if (isAlpha(value)) {
            return value.toUpperCase();
        } else {
            return "Entrada no válida";
        }
    }

    // Método para verificar si un String es un decimal
    public static boolean isDecimal(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // Método para verificar si un String es un entero
    public static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }

    // Método para verificar si un String es alfabético
    public static boolean isAlpha(String str) {
        return str.matches("[a-zA-Z]+");
    }

    // Método para redondear un número a dos decimales
    public static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
