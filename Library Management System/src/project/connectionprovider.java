/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author HP-PC
 */
public class connectionprovider {
    public static Connection getcon()
    {
        try
        { 
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root");
          return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
          System.out.println(e);
          return null;
        }
}
}