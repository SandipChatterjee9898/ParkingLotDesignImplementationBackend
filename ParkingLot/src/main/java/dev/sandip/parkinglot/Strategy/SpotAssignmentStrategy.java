package dev.sandip.parkinglot.Strategy;

import dev.sandip.parkinglot.Model.Gate;
import dev.sandip.parkinglot.Model.ParkingSpot;
import dev.sandip.parkinglot.Model.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
