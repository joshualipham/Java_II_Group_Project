/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jamendez
 */
public class DBConnection {
    
    public Connection getMyConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conTW = DriverManager.getConnection("jdbc:mysql://localhost:3306/futurelover", "root", "Deployment18!");
            return conTW;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Connection Error. Check the Database connection or Start MySQL Server", "Database Error", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
            return null;
        }
    }
    
    public boolean ExecuteData(String sqlTW) {
        boolean resultTW;
        try {
            Connection conTW = getMyConnection();
            Statement stTW = conTW.createStatement();
            stTW.executeUpdate(sqlTW);
            conTW.close();
            resultTW = true;
        } catch (Exception e) {
            e.printStackTrace();
            resultTW = false;
        }
        return resultTW;
    }
    
    public ResultSet getData(String sqlTW) {
        try {
            Connection conTW = getMyConnection();
            Statement stTW = conTW.createStatement();
            ResultSet rsTW = stTW.executeQuery(sqlTW);
            return rsTW;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
