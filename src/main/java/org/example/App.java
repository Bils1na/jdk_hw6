package org.example;

public class App 
{
    public static void main( String[] args )
    {
        int totalSimulations = 1000;
        MontyHallSimulation simulation = new MontyHallSimulation(totalSimulations);
        simulation.runSimulation();

        Result.printStatistics(simulation.getResults());
    }
}
