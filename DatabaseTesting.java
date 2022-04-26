/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author jamendez
 */
public class DatabaseTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        
         try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/response_section", "postgres", "Deployment18");
            stmt = c.createStatement();
            
            
            //Tables
            //ResultSet rs = stmt.executeQuery("SELECT * FROM salary;"); // column name is "money"
            //ResultSet rs = stmt.executeQuery("SELECT * FROM height;"); // column name is "heightinfo"
            //ResultSet rs = stmt.executeQuery("SELECT * FROM haircolor;"); // column names are "A" & "B"
            //ResultSet rs = stmt.executeQuery("SELECT * FROM eyecolor;"); // column names are "A" & "B"
            ResultSet rs = stmt.executeQuery("SELECT * FROM bodytype;"); // column names are "A" & "B"
            while (rs.next()) {
                
                String typeOne = rs.getString("A");
                String typetwo = rs.getString("B");
                
                System.out.println(typeOne);
                System.out.println(typetwo);
                
            }
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully"); 
        
    }
    
}
