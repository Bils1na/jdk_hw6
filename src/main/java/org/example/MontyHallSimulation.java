package org.example;

import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Getter
public class MontyHallSimulation {
    private int totalSimulations;
    private Map<Integer, Boolean> results;

    public MontyHallSimulation(int totalSimulations) {
        this.totalSimulations = totalSimulations;
        this.results = new HashMap<>();
    }

    public void runSimulation() {
        Random random = new Random();

        for (int i = 1; i <= totalSimulations; i++) {
            int winningDoor = random.nextInt(3);
            int chosenDoor = random.nextInt(3);

            boolean win = chosenDoor == winningDoor;
            results.put(i, win);
        }
    }
}

