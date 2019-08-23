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
 * @author Sergio Ramirez
 */
public class OracleCustomerDAO implements CustomerDAO {
    Customer oracleCloud = new Customer(1, "Joe Michaels", true, "CA - Av Jhonson", "Los Angeles");

    public OracleCustomerDAO() {
    }

    @Override
    public int insertCustomer() {
        return oracleCloud.getCustomerNumber();
    }

    @Override
    public boolean deleteCustomer() {
        return oracleCloud.getActive();
    }

    @Override
    public Customer findCustomer() {
        return oracleCloud;
    }

    @Override
    public boolean updateCustomer() {
        return oracleCloud.getActive();
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
