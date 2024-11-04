package com.roadmap.java.readmap.fundaments;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListasYarreglos {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la lista: ");
        String numeros = sc.nextLine();
        List<Integer> arrayNumeros = new ArrayList<>(Arrays.stream(numeros.split(",")).map(Integer::valueOf).toList());

        System.out.println(printResults(arrayNumeros));
    }

    public static int calculeMax(List<Integer> list){
        return list.stream().max(Integer::compareTo).get();
    }

    public static int calculeMin(List<Integer> list){
        return list.stream().min(Integer::compareTo).get();
    }

    public static int calculeSum(List<Integer> list){
        return (list.stream().reduce(0, Integer::sum))/list.size();
    }

    public static List<Integer> orderAsc(List<Integer> list){
        return list.stream().sorted().toList();
    }

    public static List<Integer> orderDesc(List<Integer> list){
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static String printResults(List<Integer> arrayNumeros){
        return new StringBuilder()
        .append("Lista ingresada: ").append(arrayNumeros).append("\n").append("\n")
                .append("Valor minimo: ").append(calculeMin(arrayNumeros)).append("\n")
                .append("Valor maximo: ").append(calculeMax(arrayNumeros)).append("\n")
                .append("Valor promedio: ")
                .append(calculeSum(arrayNumeros)).append("\n")
                .append("Lista ordenada ASC: ").append(orderAsc(arrayNumeros)).append("\n")
                .append("Lista ordenada DESC: ").append(orderDesc(arrayNumeros)).append("\n").toString();
    }
}
