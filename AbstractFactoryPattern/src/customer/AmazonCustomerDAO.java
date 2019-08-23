/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import abstractfactorypattern.Customer;

import javax.sql.RowSet;
import java.util.Collection;

/**
 *
 * @author Sergio Ramirez
 */
public class AmazonCustomerDAO implements CustomerDAO {

    Customer amazonCloud = new Customer(1, "Joe Michaels", true, "CA - Av Jhonson", "Los Angeles");

    public AmazonCustomerDAO() {
    }

    @Override
    public int insertCustomer() {
        return amazonCloud.getCustomerNumber();
    }

    @Override
    public boolean deleteCustomer() {
        return amazonCloud.getActive();
    }

    @Override
    public Customer findCustomer() {
        return amazonCloud;
    }

    @Override
    public boolean updateCustomer() {
        return amazonCloud.getActive();
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
