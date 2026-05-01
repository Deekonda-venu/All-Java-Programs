package Advance_Java.JDBC.Connections;
import java.sql.DriverManager;


import java.sql.Connection;

public class pracrice {

    public Connection connect() {

        Connection con = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");

            System.out.println("Connection established");

        }catch(Exception e){
            e.printStackTrace();

        }

        return con;

    }
}
