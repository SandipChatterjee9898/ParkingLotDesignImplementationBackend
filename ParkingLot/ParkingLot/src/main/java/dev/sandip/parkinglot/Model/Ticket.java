package dev.sandip.parkinglot.Model;

import java.util.Date;

public class Ticket extends BaseModel{
     private String number;
     private Date entryTime;
     private Operator generatedBy;
     private Gate generatedAt;
     private ParkingSpot parkingSpot;
     private Gate payedAt;
     private Vehicle vehicle;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Gate getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Gate generatedAt) {
        this.generatedAt = generatedAt;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gate getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(Gate payedAt) {
        this.payedAt = payedAt;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
