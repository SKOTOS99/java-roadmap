package com.roadmap.java.readmap.fundaments;

import java.util.*;
import java.util.stream.Collectors;

public class Narcisist {

    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 10, 15, 20, 25};

        System.out.println(numberNarcisiste(22));
        System.out.println(encondeString("Success"));
        System.out.println(getMaxAndMin("1 2 3 4 5"));
        Arrays.stream(getPowList(numeros)).forEach(System.out::println);
        getPowListCube(numeros).forEach(System.out::println);
        convertListToSqrt(numeros).forEach(System.out::println);
        convertListToPar(numeros).forEach(System.out::println);
        listNoPar(numeros).forEach(System.out::println);
        listMayor(numeros).forEach(System.out::println);



    }

    public static boolean numberNarcisiste(int number) {
        System.out.println("Numero narcisista");
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        int sum = numberStr.chars()
                .map(Character::getNumericValue)
                .map(digit -> (int) Math.pow(digit, length))
                .sum();
        return sum == number;
    }

    public static String encondeString(String word) {
        System.out.println("remplaza");
        Map<Character, Long> mapCount = (word.toLowerCase())
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return (word.toLowerCase())
                .chars()
                .mapToObj(c -> (char) c)
                .map(c -> mapCount.get(c) >1 ? ")" : "(" ).collect(Collectors.joining());

    }

    public static String getMaxAndMin(String number){
        System.out.println("maximo y minimo");
        int max =0;
        int min =0;
        max = Arrays.stream(number.split(" ")).mapToInt(Integer::parseInt).max().orElse(0);
        min = Arrays.stream(number.split(" ")).mapToInt(Integer::parseInt).min().orElse(0);
        return max + " " + min;
    }

    public static double[] getPowList(int[] numeros){
        System.out.println("cuadrado");
        return Arrays.stream(numeros).mapToDouble(num -> Math.pow(num, 2)).toArray();
    }
    public static List<Double> getPowListCube(int[] numeros){
        System.out.println("cubo");
        return Arrays.stream(numeros).mapToDouble(num -> Math.pow(num, 3)).boxed().toList();
    }

    public static List<Integer> convertListToSqrt(int[] numeros){
        System.out.println("raiz");
        return Arrays.stream(numeros)
                .map(num ->(int) Math.round(Math.sqrt(num)))
                .boxed()
                .toList();
    }

    public static List<Integer> convertListToPar(int[] numeros){
        System.out.println("par");
        return Arrays.stream(numeros)
                .filter(num -> num % 2 ==0)
                .map(num -> (int) Math.pow(num, 2))
                .boxed()
                .toList();
    }

    public static List<Integer> listNoPar(int[] numeros){
        System.out.println("No par");
        return Arrays.stream(numeros)
                .filter(num -> num % 2 !=0)
                .map(num -> num * 3)
                .boxed()
                .toList();
    }

    public static List<Integer> listMayor(int[] numeros){
        System.out.println("mayor");
        return Arrays.stream(numeros)
                .filter(num -> num > 10)
                .mapToDouble(num-> num / 2.0)
                .mapToInt(num -> (int) Math.round(num))
                .boxed().toList();
    }
}
