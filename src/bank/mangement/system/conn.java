
package bank.mangement.system;
import java.sql.*;


public class conn {
    
    Connection c;
    Statement s;
    public conn(){
        try{
           
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","@lawyerup@");
            s=c.createStatement();
            
            
          
        }catch(Exception e ){
            System.out.println(e);
        }
    }
    
}
