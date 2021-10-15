package use_cases;

//import entities.Customer;
//import entities.DeliveryMan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserManager implements DBManager<String, String> {
    private HashMap<String, String> customers;
    private HashMap<String, String> deliverymans;

    /**
     * Creates a UserManager with lists of customer and delivery man that are empty
     */
    public UserManager() {
        customers = new HashMap<String, String>();
        deliverymans = new HashMap<String, String>();
    }


    /**
     * Stores the uname and password in this customers' class list.
     * @param uname and password to be stored
     */
    public void addC(String uname, String password) {
        customers.put(uname, password);
    }

    /**
     * Stores the uname  and password in this deliveryMan' class list.
     * @param uname and password to be stored
     */
    public void addD(String uname, String password) {
        deliverymans.put(uname, password);
    }

    /**
     * checking if the consumer's input match the password
     * @param uname and password
     */
    public boolean checkC(String uname, String password) {
        if(customers.get(uname) == null){
            return false;
        }
        else{
            return customers.get(uname).equals(password);
        }

    }

    /**
     * checking if the deliveryMan's input match the password
     * @param uname and password
     */
    public boolean checkD(String uname, String password) {
        if(deliverymans.get(uname) == null){
            return false;
        }
        else{
            return deliverymans.get(uname).equals(password);
        }

    }

    /**
     * All Manager classes in use_cases have some transactions to save.
     *
     * @param obj The 'key' with which the database can be queried
     * @param val The corresponding object
     */
    @Override
    public void save(String obj, String val) {

    }

    /**
     * All Manager classes query the database for a specific object type that it is managing.
     *
     * @param obj The 'key' with which the database can be queried.
     * @return The corresponding object
     */
    @Override
    public String get(String obj) {
        return null;
    }
}
