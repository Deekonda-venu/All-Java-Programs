package Advance_Java.JDBC.Connections;

//What is JDBC?
//
//        👉 JDBC = Java Database Connectivity
//
//👉 It is used to:
//
//Connect Java program to database
//Execute SQL queries
//Get results

//Java Program → JDBC → Database (MySQL)Database

//JDBC Architecture (Basic Idea)
//
//👉 JDBC acts like a bridge between:
//
//Java application
//Database

//Core comectps

//1. Driver
//
//👉 Connects Java to database
//
//Example:

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

////
//com.mysql.cj.jdbc.Driver
//✅ 2. Connection
//
//👉 Represents connection to DB
//
//Connection con;
//✅ 3. Statement
//
//👉 Used to execute SQL
//
//Statement stmt;
//✅ 4. ResultSet
//
//👉 Stores data from SELECT query
//
//ResultSet rs;
//✅ 5. DriverManager
//
//👉 Helps to create connection
//
//DriverManager.getConnection()





//
//    2. Statement Types
//🔹 1. Statement
//
//👉 For static SQL
//
//Statement stmt = con.createStatement();
//
//✔ Simple
//❌ Not secure
//❌ SQL Injection risk
//
//🔹 2. PreparedStatement ⭐ (IMPORTANT)
//
//        👉 For dynamic queries
//
//PreparedStatement ps = con.prepareStatement(
//        "INSERT INTO user VALUES (?, ?)"
//);
//
//✔ Prevents SQL Injection
//✔ Faster (precompiled)
//✔ Used in real projects
//
//🔹 3. CallableStatement
//
//👉 Used for Stored Procedures
//
//CallableStatement cs = con.prepareCall("{call myProcedure()}");
//
//✔ Less commonly used



//executeQuery vs executeUpdate
//Query Type	Method	Return Type
//SELECT	executeQuery()	ResultSet
//INSERT	executeUpdate()	int
//UPDATE	executeUpdate()	int
//DELETE	executeUpdate()	int


//Flow (Very Important)
//SELECT → executeQuery() → ResultSet → rs.next()
//INSERT/UPDATE/DELETE → executeUpdate() → int (rows)
//
public class Basics {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");

            System.out.println("Connection established");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM user");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " " + name);
            }

            // 6. Close Connection
            con.close();



        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
