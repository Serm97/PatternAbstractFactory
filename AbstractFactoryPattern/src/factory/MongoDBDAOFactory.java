package factory;

import customer.CustomerDAO;
import customer.MongoCustomerDAO;

public class MongoDBDAOFactory extends DAOFactory {
    public static final String DRIVER =
            "COM.MongoDB.core.RmiJdbcDriver";
    public static final String DBURL =
            "jdbc:MongoDB:rmi://localhost:1501/CoreJ2EEDB";

    public MongoDBDAOFactory() {
    }

    // method to create Cloudscape connections
    public String createConnection() {
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        return "Connect to Mongo DB > " + DRIVER + "::" + DBURL + "\n";
    }

    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new MongoCustomerDAO();
    }
}
