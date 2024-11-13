package dev.sandip.parkinglot.Strategy;

import dev.sandip.parkinglot.Model.Gate;
import dev.sandip.parkinglot.Model.ParkingSpot;
import dev.sandip.parkinglot.Model.VehicleType;

public class RandomAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate){
        return null;
    }
}
