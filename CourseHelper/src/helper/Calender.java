/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Frank.Tilugulilwa
 */
public class Calender {
    
    String dbUrl = "jdbc:mysql://localhost:3306/cw";
    String usr = "root";
    String pwd = "frank";
    
    public Boolean verify( int paramYear, int paramSemester){
        Boolean answer = true;
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(dbUrl, usr, pwd);
            Statement stmt = con.createStatement();
            
            String sql = "SELECT calenderyear, Semester, Active FROM calenderyear WHERE Active=1 AND calenderyear='"+paramYear+"' and Semester='"+paramSemester+"' ;";
           
            ResultSet rs = stmt.executeQuery(sql);
            
            answer = rs.next();
            
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return answer;
    }
    
}