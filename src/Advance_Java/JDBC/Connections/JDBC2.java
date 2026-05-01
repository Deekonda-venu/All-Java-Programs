package Advance_Java.JDBC.Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC2 {

    public void jdbc (){
        pracrice pr = new pracrice();
        try{
            Connection con = pr.connect();
            String sql = "SELECT * FROM user;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();


        }catch(Exception e){
            e.printStackTrace();

        }

    }

}
