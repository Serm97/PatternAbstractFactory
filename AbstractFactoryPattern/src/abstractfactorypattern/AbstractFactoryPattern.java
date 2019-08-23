/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

import customer.CustomerDAO;
import factory.CloudscapeDAOFactory;
import factory.DAOFactory;

/**
 *
 * @author Sergio Ramirez
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Connection for Cloudscape
        DAOFactory cloudscapeFactory = DAOFactory.getDAOFactory(DAOFactory.CLOUDSCAPE);
        System.out.println(cloudscapeFactory.createConnection());
        CustomerDAO customer = cloudscapeFactory.getCustomerDAO();
        System.out.println("Customer created with cod " + customer.insertCustomer()+"\n\n");

        // Connection for Cloudscape
        DAOFactory oracleFactory = DAOFactory.getDAOFactory(DAOFactory.ORACLE);
        System.out.println(oracleFactory.createConnection());
        CustomerDAO customerO = oracleFactory.getCustomerDAO();
        System.out.println("Customer has been updated: " + customerO.updateCustomer());



    }

}
