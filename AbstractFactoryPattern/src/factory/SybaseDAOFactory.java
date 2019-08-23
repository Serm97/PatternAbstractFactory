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
public class SybaseDAOFactory extends DAOFactory {

    public static final String DRIVER=
            "COM.sybase.core.JdbcDriver";
    public static final String DBURL=
            "jdbc:sysbase:rmi://localhost:3352/CoreJ2EEDB";

    public SybaseDAOFactory() {
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return null;
    }

    @Override
    public String createConnection() {
        return "Connect to SysBase > " +DRIVER + ":"+DBURL+"\n";
    }


}
