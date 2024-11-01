package com.roadmap.java.readmap.fundaments;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Age {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println(name + " years old: " + calculateAge(age));
        System.out.println(name +" "+ isMayor(age));

    }

    public static String isMayor(int age) {
        return age > 18 ? "es mayor de edad" : "no es mayor de edad";
    }

    public static int calculateAge(int age) {
        LocalDateTime date =LocalDateTime.now();
        return date.getYear() - age;
    }
}
