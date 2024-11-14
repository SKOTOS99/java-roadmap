package com.roadmap.java.readmap.fundaments;

import java.util.Scanner;

public class Aritmetics {

    public static final String SUMA= "suma: ";
    public static final String RESTA = "resta: ";
    public static final String MULTIPLICACION = "multiplicacion: ";
    public static final String DIVICION = "divicion: ";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println(printResultado(num,num2));

    }
    public static int sumas(int num1, int num2) {
        return num1 + num2;
    }
    public static int restas(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicaciones(int num1, int num2) {
        return num1 * num2;
    }
    public static int diviciones(int num1, int num2) {
        return num1 / num2;
    }

    public static String printResultado(int num, int num2) {
        return new StringBuilder()
        .append(SUMA).append(sumas(num,num2)).append("\n").append(RESTA).append(restas(num,num2))
                .append("\n").append(MULTIPLICACION).append(multiplicaciones(num,num2)).append("\n")
                .append(DIVICION).append(diviciones(num,num2)).toString();
    }
}
