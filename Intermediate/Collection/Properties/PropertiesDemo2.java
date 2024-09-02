package Collection.Properties;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fi = new FileInputStream("db.properties");
        p.load(fi);
        String url = p.getProperty("url");
        String user = p.getProperty("user");
        String pwd = p.getProperty("pwd");
        Connection co = DriverManager.getConnection(url,user,pwd);
    }
}
