package dev.sandip.parkinglot.Model;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int parkingSpotNumber;
    private VehicleType supportedVehicle;
    private ParkingLotStatus parkingLotStatus;
    private ParkingFloor parkingFloor;

    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(int parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public VehicleType getSupportedVehicle() {
        return supportedVehicle;
    }

    public void setSupportedVehicle(VehicleType supportedVehicle) {
        this.supportedVehicle = supportedVehicle;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
