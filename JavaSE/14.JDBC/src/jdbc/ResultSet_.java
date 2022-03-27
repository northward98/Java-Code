package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 演示查询语句返回 ResultSet ,并取出结果
 */

public class ResultSet_ {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        //得到statement
        Statement statement = connection.createStatement();
        String sql = "select id,name,sex,borndate from actor";
        ResultSet resultSet = statement.executeQuery(sql);//此处是DQL语句

        //使用while取出数据
        while (resultSet.next()){
            int id = resultSet.getInt(1);//获取该行的第一列数据
            String name = resultSet.getString(2);//获取该行的第一列数据
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" +date);
        }

        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
