/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Driver extends Employee{
    
    private Vehicle vehicle;
    
    public Driver(int employeeNo, String name){
        super(employeeNo, name);
    }
    
    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    
    public boolean giveCargo(Delivery delivery){
        
    }
    
    public void deliver(){
        
    }
    
    public String toString(){
        String result = "";
        return result;
    }
}
