/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import abstractfactorypattern.Customer;

import java.util.Collection;
import javax.sql.RowSet;

/**
 *
 * @author Sergio Ramirez
 */
public class CloudscapeCustomerDAO implements CustomerDAO {

    Customer customerCloud = new Customer(1, "Joe Michaels", true, "CA - Av Jhonson", "Los Angeles");

    public CloudscapeCustomerDAO() {
    }

    @Override
    public int insertCustomer() {
        return customerCloud.getCustomerNumber();
    }

    @Override
    public boolean deleteCustomer() {
        return customerCloud.getActive();
    }

    @Override
    public Customer findCustomer() {
        return customerCloud;
    }

    @Override
    public boolean updateCustomer() {
        return customerCloud.getActive();
    }

    @Override
    public RowSet selectCustomersRS() {
        return null;
    }

    @Override
    public Collection selectCustomersTO() {
        return null;
    }
    
}
