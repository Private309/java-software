/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vinee
 */
public class Dbconnection {
    static Connection con;
    public static Connection getconnect()
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql:///billing_software","root","root"); 
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return con;
    
    }
}
