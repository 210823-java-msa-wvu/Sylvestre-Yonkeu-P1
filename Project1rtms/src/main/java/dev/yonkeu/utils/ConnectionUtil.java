package dev.yonkeu.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

    //static means class scope
    private static ConnectionUtil cu = null;
    private static Properties trmsprops;

    private ConnectionUtil() {

        //Gets info from property file
        trmsprops = new Properties();

        //helps read information in the connection properties file to interact with it
        InputStream dbProps = ConnectionUtil.class.getClassLoader().getResourceAsStream("trmsconnection.properties");
        try {
            trmsprops.load(dbProps);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ConnectionUtil getConnectionUtil() {
        //does it exist? if it doesn't creae a new cu but if it does exist, return the old cu
        if (cu == null) {
            cu = new ConnectionUtil();
        }
        return cu;
    }

    //get connection (which is class to import) itself
    public Connection getConnection() {

        Connection conn = null;
        //credentials needed to access database
        String url = trmsprops.getProperty("url");
        String username = trmsprops.getProperty("username");
        String password = trmsprops.getProperty("password");

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

//        public static void main(String[] args) {
//        Connection connection = getConnectionUtil().getConnection();
//
//        if (connection != null) {
//            System.out.println("Connection Successful");
//        } else {
//            System.out.println("didn't work");
//        }
//    }

}
