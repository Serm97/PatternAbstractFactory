package factory;

import customer.AmazonCustomerDAO;
import customer.CustomerDAO;

public class AmazonDBDAOFactory extends DAOFactory {

    public static final String DRIVER =
            "COM.Amazon.core.RmiJdbcDriver";
    public static final String DBURL =
            "jdbc:Amazon:rmi://localhost:1552/CoreJ2EEDB";

    public AmazonDBDAOFactory() {
    }

    // method to create Cloudscape connections
    public String createConnection() {
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        return "Connect to Amazon > " + DRIVER + "::" + DBURL + "\n";
    }

    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new AmazonCustomerDAO();
    }
}
