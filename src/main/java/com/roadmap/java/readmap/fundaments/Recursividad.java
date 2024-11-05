package com.roadmap.java.readmap.fundaments;

import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        int n = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n: ");
        n = sc.nextInt();

        System.out.println("Sin recursividad: ");
        long startTime = System.nanoTime();
        int resultNormal = normal(0, 1, n);
        long endTime = System.nanoTime();
        System.out.println("Resultado: " + resultNormal);
        System.out.println("Tiempo iterativo: " + (endTime - startTime) + " ns");

        System.out.println("Con recursividad: ");
        startTime = System.nanoTime();
        int resultRecursive = recursividad(0, 1, n);
        endTime = System.nanoTime();
        System.out.println("Resultado: " + resultRecursive);
        System.out.println("Tiempo recursivo: " + (endTime - startTime) + " ns");

        sc.close();


    }

    public static int normal(int a, int b, int n){
        int c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int recursividad(int a, int b, int n){
        if(n <= 1){
            return b;
        }
        return recursividad(b, a + b, n - 1);

    }
}
