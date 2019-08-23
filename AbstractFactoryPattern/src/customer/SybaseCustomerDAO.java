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
public class SybaseCustomerDAO implements CustomerDAO {

    Customer sybaseCloud = new Customer(1, "Joe Michaels", true, "CA - Av Jhonson", "Los Angeles");

    public SybaseCustomerDAO() {
    }

    @Override
    public int insertCustomer() {
        return sybaseCloud.getCustomerNumber();
    }

    @Override
    public boolean deleteCustomer() {
        return sybaseCloud.getActive();
    }

    @Override
    public Customer findCustomer() {
        return sybaseCloud;
    }

    @Override
    public boolean updateCustomer() {
        return sybaseCloud.getActive();
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
