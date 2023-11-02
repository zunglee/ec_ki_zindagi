package jeena_ec_ka_naam_h.ec_ki_zindagi.auth_service.database;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.sql.*;

public class DBRepo {

    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    @Value("${db.mysql.url}")
    String connectionUrl;
    @Value("${db.mysql.username}")
    String dbUsername;
    @Value("${db.mysql.password}")
            String dbPassword;

    public static Connection connection;
    public DBRepo()  {
        try {
            connection = DriverManager.getConnection(connectionUrl, dbUsername, dbPassword);
        }catch(Exception Ex){
            LOG.error("Error Connection with MYSQL =["+ Ex.getMessage()+"]");
        }
    }

    public String getEntityPassword(String emailId){
        String query = "SELECT PASSWORD FROM PROFILE WHERE EMAIL_ID = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1,emailId);
            ResultSet myRs= stmt.executeQuery();
            return myRs.next() ? myRs.getString("PASSWORD") : null;
        }catch(Exception ex){
            LOG.error("Exception ex ["+ex.getMessage()+"]");
        }
            return null;
    }

}
