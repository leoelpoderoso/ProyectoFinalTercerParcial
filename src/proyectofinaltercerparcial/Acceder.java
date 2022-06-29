/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinaltercerparcial;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Acceder {
    
    public static Connection obtenerConexion(){
       String user="root";
       String password="root";
       String url="jdbc:mysql://localhost:3306/nomina?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
       Connection con=null;
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");   
         con =(Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }return con;
       
    }
    
}
