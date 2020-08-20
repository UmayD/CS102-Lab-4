/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
abstract class Employee extends Person {
    
    private static final int MAX_JOBS = 5;
    int currentJobs = 0;
    Delivery[] deliveries;
    private double salary;
    private int employeeNo;

    public Employee(int employeeNo, String name) {
        super(name);
        this.employeeNo = employeeNo;
        deliveries = new Delivery[MAX_JOBS];
    }

    public void adjustSalary(double value) {
        salary = value;
    }

    //to check the availability of the employee
    public boolean getAvailability() {
        if(currentJobs >= MAX_JOBS ){
        //if (deliveries[MAX_JOBS - 1] != null) {
            return false;
        } else {
            return true;
        }
    }

    
    //public abstract Delivery addJob(Item sendItem, Customer sender, Customer receiver, int packageNo);
        /*String it = sendItem.getContent();
        Delivery d;
        if (sendItem.getWeight() > 0.1) {
            d = new Package(sendItem, sender, receiver, packageNo);
        } else {
            d = new Mail(it, sender, receiver, packageNo);
        }
        //for loop to increase the currentjob and add to the delivery array
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] == null) {
                currentJobs++;
                deliveries[i] = d;
                return;
            }
        }
    }*/

    public void deliverPackage() {
        String result = "";
        for (Delivery delivery : deliveries) {
            if (delivery != null) {
                result = result + "\n" + delivery + "\n";
            }
        }
        //System.out.println(result);
        deliveries = new Delivery[MAX_JOBS];
        currentJobs = 0;
    }

    public abstract String toString();
    
}
