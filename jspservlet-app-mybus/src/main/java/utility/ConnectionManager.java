package utility;
import java.sql.*;
public class ConnectionManager {
    private ConnectionManager(){};

    static public Connection getConnection()
    {
        Connection connection=null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           connection=DriverManager.getConnection("jdbc:mysql://localhost/Bus_System","root","examly");
           System.out.println("Connection Successfull");
        }catch(Exception e)
        {
          System.out.println(e);
     
        }
    return connection;
    }
}
