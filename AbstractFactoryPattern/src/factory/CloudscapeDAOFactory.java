/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 * @author Sergio Ramirez
 */
// Cloudscape concrete DAO Factory implementation

import customer.CloudscapeCustomerDAO;
import customer.CustomerDAO;

public class CloudscapeDAOFactory extends DAOFactory {
    public static final String DRIVER =
            "COM.cloudscape.core.RmiJdbcDriver";
    public static final String DBURL =
            "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";

    public CloudscapeDAOFactory() {
    }

    // method to create Cloudscape connections
    public String createConnection() {
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        return "Connect to Cloudscape > " + DRIVER + "::" + DBURL + "\n";
    }

    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new CloudscapeCustomerDAO();
    }


}
