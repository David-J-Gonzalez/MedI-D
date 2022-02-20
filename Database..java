package com.Hackathon;
import java.sql.*;

public class Database {
    public static void insertData(String data){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/medi_d","root","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate(data);

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
