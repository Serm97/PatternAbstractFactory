/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

import java.io.Serializable;

/**
 *
 * @author Sergio Ramirez
 */
public class Customer implements Serializable {
    // member variables

    int CustomerNumber;
    String name;
    Boolean active;
    String streetAddress;
    String city;

    public Customer(int customerNumber, String name, Boolean active, String streetAddress, String city) {
        CustomerNumber = customerNumber;
        this.name = name;
        this.active = active;
        this.streetAddress = streetAddress;
        this.city = city;
    }

    public int getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(int CustomerNumber) {
        this.CustomerNumber = CustomerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
