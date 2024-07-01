package org.example;

import java.util.Map;

public class Result {

    public static void printStatistics(Map<Integer, Boolean> results) {
        long wins = results.values().stream().filter(win -> win).count();
        long losses = results.size() - wins;

        System.out.println("Всего симуляций: " + results.size());
        System.out.println("Побед: " + wins);
        System.out.println("Поражений: " + losses);
        System.out.println("Процентное соотношение: " + (double) wins / results.size() * 100 + "%");
    }
}
