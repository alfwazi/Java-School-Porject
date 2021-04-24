/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Badr Alfwazi
 */
public class dataQuery {
    private String query;
    private String username;
    private String Password;
    private String optaion;
    public dataQuery() {
    this(null,null);
    }
    public dataQuery(String input,String option) {
    }
    
    // Main Function to Excute All SQL QUERY and return (ResultSet Data Type)
    public ResultSet runQuery(String query)  {
        DbConnection Login = new DbConnection();
        try {
            if (Login.getConnection() !=null ) {
        Statement st = Login.getConnection().createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
            }
            else {
            return null;
        }
            }
        catch (SQLException e) {
            System.out.println("ERROR : "+e);
        }
        return null;
    }
    
        public int updateQuery(String query){
        DbConnection Login = new DbConnection();
        try {
        if (Login.getConnection() !=null ) {
        Statement st = Login.getConnection().createStatement();
        int rs = st.executeUpdate(query);
        return rs;
         }
        }
        catch (SQLException e) {
            System.out.println("Error "+e);
        }
        return 0;
    }
        public boolean insertQuery(String query)  {
        DbConnection Login = new DbConnection();
        try {
        if (Login.getConnection() !=null ) {
        Statement st = Login.getConnection().createStatement();
        boolean rs = st.execute(query);
        return rs;
        }
    else {
        }
            }
        catch (SQLException e) {
            System.out.println("ERROR : "+e);
        }
        return true;
    }
    // Function To Check admin username and password and return true or false
    public boolean loginCheck(String username,String password)  {
        DbConnection Login = new DbConnection();
        try {
       PreparedStatement st = Login.getConnection().prepareStatement("SELECT * FROM admin WHERE username=? AND password=?");
       st.setString(1, username);
       st.setString(2,password);
       ResultSet rs =st.executeQuery();
       return rs.next();
        }
       catch (SQLException e) {
        System.out.println("ERROR "+e);  
        }
        return false;
    }
    
    // Function To Get all Sutdents data from database and return as ResultSet
    public ResultSet getStudent(int id)  {
        DbConnection get = new DbConnection();
        try {
       PreparedStatement st = get.getConnection().prepareStatement("SELECT * FROM users WHERE sid=?");
       st.setInt(1,id);
       ResultSet rs =st.executeQuery();
       return rs;
        }
       catch (SQLException e) {
        System.out.println("ERROR "+e);  
        }
        return null;
    }
        public ResultSet getEmployee(int id)  {
        DbConnection get = new DbConnection();
        try {
       PreparedStatement st = get.getConnection().prepareStatement("SELECT * FROM employees WHERE eid=?");
       st.setInt(1,id);
       ResultSet rs =st.executeQuery();
       return rs;
        }
       catch (SQLException e) {
        System.out.println("ERROR "+e);  
        }
        return null;
    }
    
        public ResultSet studentInfo(int id) throws SQLException {
        query = "SELECT * from users wehere id='"+id+"'";
        ResultSet result = runQuery(query);
        if (result.next()) {
        return result;
        }
        else {
            return null;
    }
    }
    public void setOptaion(String optaion) {
        this.optaion = optaion;
    }
    
}
