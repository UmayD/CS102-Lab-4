/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class CustomerService extends Employee{
    
    private int MAX_JOBS;
    private int currentJobs;
    
    public CustomerService(int employeeId, String name){
        super(employeeId, name);
    }
    
    public boolean getAvailibility(){
        return super.getAvailability();
    }
    
    public Delivery addJob(Item item, Customer sender, Customer receiver, int packageNo){
        String it = item.getContent();
        Delivery d;
        if (item.getWeight() > 0.1) {
            d = new Package(item, sender, receiver, packageNo);
        } else {
            d = new Mail(it, sender, receiver, packageNo);
        }
        //for loop to increase the currentjob and add to the delivery array
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] == null) {
                currentJobs++;
                deliveries[i] = d;
            }
        }
        return d;
    }
    
    public void finishJobs(){
        super.deliverPackage();
    }
    
    public String toString(){
        String result = "";
        return result;
    }
    
}
