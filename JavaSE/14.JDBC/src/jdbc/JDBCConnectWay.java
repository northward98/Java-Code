package jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 演示数据库连接的5种方式
 */

public class JDBCConnectWay {
    public static void main(String[] args){
    }
    @Test
    //方式一：属于静态加载，灵活性差，依赖强
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/e01";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "983165");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }
    @Test
    //方式二
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        //使用反射加载Driver类，动态加载，更加灵活
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/e01";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "983165");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }
    @Test
    //方式三：使用DriverManager 替代 Driver 进行统一管理
    public void connect03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/e01";
        String user = "root";
        String password = "983165";
        DriverManager.registerDriver(driver);//注册Driver驱动
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
    @Test
    //方式四：使用Class.forName 自动完成注册驱动
    public void connect04() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//此处省略也可以，但建议写上
        String url = "jdbc:mysql://localhost:3306/e01";
        String user = "root";
        String password = "983165";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
    @Test
    //方式五：使用配置文件，连接数据库更加灵活 (建议使用)
    public void connect05() throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
