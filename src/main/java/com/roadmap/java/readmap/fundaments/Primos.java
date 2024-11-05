package com.roadmap.java.readmap.fundaments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Primos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String numbers = sc.nextLine();

        List<Integer> listNumbers = new ArrayList<>(Arrays.stream(numbers.split(",")).map(Integer::valueOf).toList());







    }

    public static List<Integer> getPrimes(List<Integer> listNumbers) {
        return listNumbers.stream().filter(num -> num % 2!= 0).toList();
    }

    public static List<Integer> getPar(List<Integer> listNumbers) {
        return listNumbers.stream().filter(num -> num % 2== 0).toList();
    }

    public static List<Integer> getNegatives(List<Integer> listNumbers) {
        return listNumbers.stream().filter(num -> num < 0).toList();
    }

    public static List<Integer> getPositives(List<Integer> listNumbers) {
        return listNumbers.stream().filter(num -> num > 0).toList();
    }

    public static int countNumers(List<Integer> listNumbers){
        return listNumbers.size();
    }

    public static int countNumbers(List<Integer> listNumbers){
        return listNumbers.stream().reduce(0, Integer::sum);
    }
}
