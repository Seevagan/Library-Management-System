/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.management.Query;

/**
 *
 * @author Seevagan
 */
public class DBConnect {
    Connection conn = null;
    Statement state = null;
   public void createConnect()
   {
                
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
                 catch (ClassNotFoundException e) {
			System.out.println("ERROR with Connectivity Driver");
		}
		try {
	             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","1234");
		    } 
                catch (SQLException e) {
	              System.out.println("Error in Connection");
		}
			
}
   public ResultSet query(String str) 
   {
       createConnect();
       
       
       ResultSet rs=null;
       try {
       state=(Statement) conn.createStatement();
       rs=state.executeQuery(str);
       }
       catch(SQLException e) {
	              System.out.println("Error in Connection");
		}
      
        return rs;
   }
   public String Insert(String str)
   {
                createConnect();
               
		try {
                     state =(Statement) conn.createStatement();
                     //System.out.println(str);
                     state.executeUpdate(str);
		    } 
                catch (SQLException e) {
                    e.printStackTrace();
	              System.out.println("Error in Connection1");
		}
         
    return "Success";
       }
       
       
    
}
