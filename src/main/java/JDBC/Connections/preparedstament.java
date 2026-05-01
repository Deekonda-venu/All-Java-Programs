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