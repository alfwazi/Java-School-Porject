/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Badr Alfwazi
 */
public class DbConnection {
    private Connection connection;
    private final String path = "C:\\Users\\VHW\\Desktop\\school\\schoolDatabase2.accdb"; // THIS IS THE PATH OF THE DATABASE FILE (Microsoft Access DataBase Files)

      public Connection getConnection() {
          
          try {
              return connection = DriverManager.getConnection("jdbc:ucanaccess://"+path);
          }
          catch (SQLException e) {
              System.out.println("ERROR : "+e);
              System.exit(0);
          }
        return null;
    }
}

