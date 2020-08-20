/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Truck extends Vehicle implements Locatable{
    
    private int TRUCK_CAPACITY;
    private double TRUCK_SPEED;
    private double TRUCK_WEIGHT_LIMIT;
    
    public Truck(int vehicleNo){
        super(vehicleNo);
    }
    
    public String drive(){
        String result;
        
        return result;
    }
    
    public int getDeliveryLimit(){
        return TRUCK_CAPACITY;
    }
    
    public double getWeightLimit(){
        return TRUCK_WEIGHT_LIMIT;
    }
    
    public String toString(){
        
    }
    
}
