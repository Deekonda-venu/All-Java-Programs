package Advance_Java.JDBC.Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class preparedstament {

    public static void main(String[] args) {
        Connection con = new pracrice().connect();
        if (con == null) {
            return;
        }

        String sql = "INSERT INTO user(id, name) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, 1);
            ps.setString(2, "abc");

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void jdbc(){
        pracrice pr = new pracrice();

        try{
            Connection con = pr.connect();
            if (con == null) {
                return;
            }

            PreparedStatement ps = con.prepareStatement("insert into user values(?,?)");
            ps.close();
            

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

//
//PreparedStatement ps = con.prepareStatement(
//        "INSERT INTO user VALUES (?, ?)"
//);
//
//ps.setInt(1, 2);
//ps.setString(2, "Ravi");
//
//int rows = ps.executeUpdate();
//
//System.out.println("Inserted: " + rows);


//import java.sql.*;
//
//public class Basics {
//    public static void main(String[] args) {
//
//        try {
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/testdb",
//                    "root",
//                    "root"
//            );
//
//            // PreparedStatement with parameter
//            PreparedStatement ps = con.prepareStatement(
//                    "SELECT * FROM user WHERE id = ?"
//            );
//
//            // set value
//            ps.setInt(1, 1);
//
//            // execute
//            ResultSet rs = ps.executeQuery();
//
//            // read result
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//
//                System.out.println(id + " " + name);
//            }
//
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}