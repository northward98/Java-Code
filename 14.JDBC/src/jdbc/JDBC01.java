package jdbc;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC01 {
    public static void main(String[] args) throws SQLException {
        //(1)注册驱动：加载Driver类
        Driver driver = new Driver();

        //(2)获取连接：得到Connection
        String url = "jdbc:mysql://localhost:3306/e01";
        Properties properties = new Properties();
        //user和password是规定好的，后面的值根据实际情况写
        properties.setProperty("user", "root");
        properties.setProperty("password", "983165");
        Connection connect = driver.connect(url, properties);

        //(3)执行增删改查：发送SQL给MySQL执行
        String sql = "insert into actor values(null,'Liu','男','1970-11-11','110')";
        //statement 用于执行静态SQL语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//如果是dml语句，返回的就是影响行数
        System.out.println(rows > 0 ? "成功" : "失败");

        //(4)释放资源
        statement.close();
        connect.close();
    }
}
