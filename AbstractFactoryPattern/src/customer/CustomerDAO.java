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
public interface CustomerDAO {

    public int insertCustomer();

    public boolean deleteCustomer();

    public Customer findCustomer();

    public boolean updateCustomer();

    public RowSet selectCustomersRS();

    public Collection selectCustomersTO();
}
