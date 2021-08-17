package com.udemy.generics.application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

    public static void main(String[] args) {

        // HashMap -> rápido e não ordenado (usa tabela hash)
        // TreeMap -> mais lento e ordenado pelo compareTo ou Comparator (usa árvore rubro negra)
        // LinkedHashMap -> velocidade intermediária e elementos na ordem em que são adicionados

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }

}
