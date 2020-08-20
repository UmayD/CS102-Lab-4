/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
abstract class Vehicle implements Locatable {

    private double speed;
    private int capacity;
    private double weightLimit;
    private int vehicleNo;
    private Delivery[] deliveries;
    private int numOfDeliveries;
    private double currentWeight;

    /*public Vehicle(double speed, int capacity, double weightLimit, int vehicleNo) {
        this.capacity = capacity;
        this.speed = speed;
        this.weightLimit = weightLimit;
        this.vehicleNo = vehicleNo;
        deliveries = new Delivery[capacity];
    }*/
    
    public Vehicle(int vehicleNo) {
        this.vehicleNo = vehicleNo;
        deliveries = new Delivery[capacity];
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public int getNumOfDeliveries() {
        return numOfDeliveries;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void loadDelivery(Delivery delivery) {
        if (numOfDeliveries < capacity) {
            deliveries[numOfDeliveries] = delivery;
            numOfDeliveries++;
        }
    }

    public static double calculateDistance(Locatable source, Locatable target) {
        double distance;
        distance = Math.sqrt(((target.getX() - source.getX())*(target.getX() - source.getX())) + (target.getY() - source.getY())*(target.getY() - source.getY()));
        return distance;
    }

    public abstract String toString();

    public abstract double getWeightLimit();

    public abstract int getDeliveryLimit();

    public abstract String drive();

}
