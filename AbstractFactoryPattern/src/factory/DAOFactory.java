/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import customer.CustomerDAO;

/**
 *
 * @author Sergio Ramirez
 */
// Abstract class DAO Factory
public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static final int CLOUDSCAPE = 1;
    public static final int ORACLE = 2;
    public static final int SYBASE = 3;
    public static final int MONGODB = 4;
    public static final int AMAZONDB = 5;

    // There will be a method for each DAO that can be
    // created. The concrete factories will have to
    // implement these methods.
    public abstract CustomerDAO getCustomerDAO();
    public abstract  String createConnection();


    public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            case CLOUDSCAPE:
                return new CloudscapeDAOFactory();
            case ORACLE:
                return new OracleDAOFactory();
            case SYBASE:
                return new SybaseDAOFactory();
            case MONGODB:
                return new MongoDBDAOFactory();
            case AMAZONDB:
                return new AmazonDBDAOFactory();
            default:
                return null;
        }
    }

}
