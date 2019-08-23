/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import customer.CustomerDAO;
import customer.OracleCustomerDAO;

/**
 * @author Sergio Ramirez
 */
public class OracleDAOFactory extends DAOFactory {

    public static final String DRIVER =
            "COM.Oracle.core.RmiJdbcDriver";
    public static final String DBURL =
            "jdbc:Oracle:rmi://localhost:3321/CoreJ2EEDB";

    public OracleDAOFactory() {
    }

    // method to create Cloudscape connections
    public String createConnection() {
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        return "Connect to Oracle > " + DRIVER + "::" + DBURL + "\n";
    }

    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new OracleCustomerDAO();
    }

}
