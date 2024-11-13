package dev.sandip.parkinglot.Factory;

import dev.sandip.parkinglot.Model.SpotAssignmentStrategyType;
import dev.sandip.parkinglot.Strategy.RandomAssignmentStrategy;
import dev.sandip.parkinglot.Strategy.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategyForType(SpotAssignmentStrategyType spotAssignmentStrategyType){
       // if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.nearest))
       //     return new NearestSpotAssignmentStrategy();
       // else if(spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.cheapest))
       //     return new CheapestSpotAssignmentStrategy();
        return new RandomAssignmentStrategy();
    }
}
