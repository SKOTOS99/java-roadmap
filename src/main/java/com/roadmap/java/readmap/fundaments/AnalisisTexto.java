package com.roadmap.java.readmap.fundaments;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnalisisTexto {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto: ");
        String texto = sc.nextLine();
        texto = texto.replaceAll("[^a-zA-Z0-9]\\s+", " ").toLowerCase();
        List<String> words = new ArrayList<>(Arrays.stream(texto.split(" ")).toList());
        AtomicInteger count = new AtomicInteger(1);
        orderMap(words).forEach(key ->
                System.out.println(count.getAndIncrement() +"° palabra mas repetida: "
                        + key.getKey() + " No."+ key.getValue())
        );
    }

    public static Stream<Map.Entry<String, Long>> orderMap(List<String> words){
         Map<String, Long> map= new HashMap<>(words.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())));

        return map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed());


    }
}
