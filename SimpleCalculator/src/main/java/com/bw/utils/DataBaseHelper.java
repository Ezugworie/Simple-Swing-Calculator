/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author byteworks
 */
public class DataBaseHelper {
  
    
    Statement statement = null;
    
    Connection  connection = null;
    
    // url points to JDBC protocol: mysql subprotocol;
// localhost is the address of the server where we installed our
// DBMS (i.e. on local machine) and 5432 is the port on which
// we need to contact our DBMS
        private String url = "jdbc:postgresql://localhost:5432/";
        private String database = "CalculatorDB";
       final static String userName = "postgres";
        final static String password = "byteworks";

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
     public void connect(){
         try {connection = DriverManager.getConnection (url + getDatabase(), userName, password);
               System.out.println("Database connection: Successful");
         }
         catch (SQLException e) {
               System.out.println("Database connection: Failed");
                     
   }
    
}

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }
    
}
