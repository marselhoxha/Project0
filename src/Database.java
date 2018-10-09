import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
	public static void main(String[] args) throws Exception {
		getConnection();
		
		
		
	}
	
	 public static Connection getConnection() throws Exception{
		  try{
		   String driver = "com.mysql.cj.jdbc.Driver";
		   String url = "jdbc:mysql://127.0.0.1:3306/prova?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSl=false";
		   String username = "root";
		   String password = "root";
		   Class.forName(driver);
		   
		   
		   Connection conn = DriverManager.getConnection(url,username,password);
		   
		// crea uno statement
		   String query = "SELECT * from impiegato";
		   PreparedStatement st = conn.prepareStatement(query);
		   // itera risultati
		   ResultSet rs = st.executeQuery();
		   while (rs.next()){
		   System.out.println("Nome impiegato: " + rs.getString("nome"));
		   }
		   // rilascia risorse
		   st.close();
		   rs.close();
		   conn.close();
		  
		   
		  } catch(Exception e){System.out.println(e);}
		  
		  
		  return null;
		 }
	 
	 	
}
