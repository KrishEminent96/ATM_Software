
package Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    
     public static Connection connect(){
        
        Connection conn = null;
        
        String url,user,pass;
        url = "jdbc:mysql://localhost:3306/atm_software?userSSL=true";
        user = "root";
        pass = "";
        
        try{
        
        
           Class.forName("com.mysql.cj.jdbc.Driver"); // *_*_*_Adding the JDBC Driver_*_*_*
            
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Driver Loaded !");
          
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
        return conn;
    
    }

    public static Connection getConnection() {
        return connect();
    }
    
}
