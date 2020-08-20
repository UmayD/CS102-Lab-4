
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umay
 */
public class Company implements Locatable {

    private final int EMPLOYEE_CAPACITY = 15;
    private final int VEHICLE_CAPACITY = 15;
    private Employee[] employees;
    private Vehicle[] vehicles;
    private ArrayList<Customer> customers;
    private ArrayList<Delivery> delivery;
    private int numOfEmployees = 0;
    private int numOfVehicles = 0;
    private int employeeNo;
    private int vehicleNo;
    private int packageNo;
    private int posX;
    private int posY;

    public Company(int x, int y) {
        posX = x;
        posY = y;
        employees = new Employee[EMPLOYEE_CAPACITY];
        vehicles = new Vehicle[VEHICLE_CAPACITY];
        customers = new ArrayList<Customer>();
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }

    public void setPos(int x, int y) {
        posX = x;
        posY = y;
    }

    public boolean addEmployee(Employee candidate) {
        boolean check = true;
        if (numOfEmployees < employees.length) {
            employees[numOfEmployees] = candidate;
            numOfEmployees++;
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    //adding customers to the arraylist
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public boolean hireEmployee(Person candidate, String type){
        if(type.equals("Driver")){
            candidate = new Driver(employeeNo, "");
            numOfEmployees++;
            return true;
        }
        else if(type.equals("CustomerService")){
            candidate = new CustomerService(employeeNo, "");
            numOfEmployees++;
            return true;
        }
        else{
            return false;
        }
    }

    //to delete the contract of the employee
    public boolean terminateContract(int employeeIndex) {
        boolean check2 = false;
        Employee[] etempt = new Employee[15];
        if (employeeIndex < employees.length) {
            for (int i = 0; i < employeeIndex; i++) {
                etempt[i] = employees[i];
            }
            for (int k = employeeIndex + 1; k < employees.length; k++) {
                etempt[k] = employees[k];
            }
            etempt = employees;
            check2 = true;
        } else {
            check2 = false;
        }
        return check2;
    }

    //to create delivery and  add job to the available employee
    public boolean createDeliverable(Item sendItem, Customer sender, Customer receiver) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getAvailability()) {
                System.out.println(sendItem);
                employees[i].(CustomerService.addJob(sendItem, sender, receiver, packageNo));
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean addVehicle(String type){
        if(type.equals("Motorcycle")){
            Motorcycle m = new Motorcycle();
            numOfVehicles++;
            return true;
        }
        else if(type.equals("Truck")){
            Truck t = new Truck();
            numOfVehicles++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean assignVehicle(int employeeIndex, int vehicleIndex){
        for(int i = 0; i < numOfEmployees; i++){
            if( employees[i] == employeeIndex )
        }
        
        return true;
    }
    
    public boolean loadDelivery(int deliveryNo, int employeeIndex){
        return false;
    }

    //to deliver and print the results
    public void deliverPackages() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null)
            employees[i].deliverPackage();
        }
    }

    public String toString() {
        String result, resultDelivery= "";
        result = "Employees: ";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += "-----------------" + employees[i].currentJobs;
                result = result + "\n" + employees[i];
            }
        }
        result = result + "\n" + "Customers: " + "\n" + customers + "\n";
        result = result + "\n" + resultDelivery;
        return result;
    }
}
