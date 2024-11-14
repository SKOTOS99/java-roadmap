package com.roadmap.java.readmap.fundaments;

import java.util.Arrays;
import java.util.Collections;

public class Colecciones {

    public static final String SUMA = "suma: ";
    public static final String PROMEDIO = "promedio: ";
    public static final String PARES = "Números pares: ";
    public static final String ORDE_DESC = "Lista ordenada en orden descendente: ";

    public static void main(String[] args) {

        int[] numeros = {10, 23, 5, 8, 19, 2};
        System.out.println(printResults(numeros));
    }

    public static int calculaSuma(int[] numeros) {
        return Arrays.stream(numeros).sum();
    }
    public static Double calculaMedia(int[] numeros) {
        return (double) calculaSuma(numeros) / numeros.length;
    }
    public static int[] filtraNumerosPares(int[] numeros){
        return Arrays.stream(numeros).filter(num -> num % 2 == 0).toArray();
    }

    public static Integer[] ordeenaDesc(int[] numeros){
        Integer[] numerosInteger = Arrays.stream(numeros).boxed().toArray(Integer[]::new);
         Arrays.sort(numerosInteger, Collections.reverseOrder());
        return numerosInteger;
    }

    public static String printResults(int[] numeros) {
        return new StringBuilder()
                .append(Arrays.toString(numeros)).append('\n')
                .append(SUMA).append(calculaSuma(numeros)).append('\n')
                .append(PROMEDIO).append(calculaMedia(numeros)).append('\n')
                .append(PARES)
                .append(Arrays.toString(filtraNumerosPares(numeros))).append('\n')
                .append(ORDE_DESC).append(Arrays.toString(ordeenaDesc(numeros))).append('\n')
                .toString();
    }
}
