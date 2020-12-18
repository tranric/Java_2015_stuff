
package humber.user;

import humber.exams.ExamMap;
import humber.schedule.Schedule;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 *
 * Author: Cody Cottrell
 *
 */
public abstract class Account {
    
    private String username;
    private String password;
    
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean auth(String username, String password ){
        Connection c = null;
        Statement stmt = null;
                   try{
                 
                   //change connection name to database name/location
     // c = DriverManager.getConnection("User:sqlite:Jonatino.db");
      c = DriverManager.getConnection("Jonatino.db");
      stmt = c.createStatement();
       ResultSet rs = stmt.executeQuery( "SELECT * FROM TEACHER;" );
     while ( rs.next() ) {
       if (username.equals(rs.getInt("TEACHER_ID")) && password.equals(rs.getString("TEACHER_PASSWORD")))
        return true;
    else
        return false;
        }
            rs = stmt.executeQuery( "SELECT * FROM ADMIN;" );

     while ( rs.next() ) {
       if (username.equals(rs.getInt("ADMIN_ID")) && password.equals(rs.getString("ADMIN_PASSWORD")))
        return true;
    else
        return false;
        }
     System.out.println("Opened database successfully");
      }
                   
                   

      catch ( Exception e ) {
      System.out.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
return true;
}
    
    public Schedule getSchedule() {
        return new Schedule();
    }
    
    public ExamMap getExams() {
        return new ExamMap();
    }
    
}
