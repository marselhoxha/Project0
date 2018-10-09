import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Db_Connection {
	
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/prova?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    
    public static final String PASSWORD = "root";
	
    String nome = "Mario";
    String cognome = "Rossi";
    
    public static void main(String args[]) 
    { 
    	 Connection connection = null;
        try
        { 
        	 Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection != null)              
                System.out.println("Connected");             
            else            
                System.out.println("Not Connected"); 
            
        
              
            connection.close(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println(e); 
	        } 
    } 
}
