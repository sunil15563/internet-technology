
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunil
 */
public class NewClass {
     public static void main(String[] args) {
     try{
         PreparedStatement ps=null;
        Connection cn=null;
        
        ResultSet out=null;
        Class.forName("org.postgresql.Driver");
        cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
        //String str="select count(*) from student";
        String str="select avg(maths),avg(science),avg(english) from student";
        ps=cn.prepareStatement(str);
        cn.close();
        
    }
    catch(Exception e){
            System.out.println(e.toString());
}
     }
        
}
