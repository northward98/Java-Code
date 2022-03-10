package jdbc;

import utils.JDBCUtils;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Blob {
    public void testInsert() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into actor(name,email,birth,photo) values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setObject(1, "jack");
        ps.setObject(2, "jack@qq.com");
        ps.setObject(1, "1000-10-10");
        ps.setObject(4, new FileInputStream("jack.jpg"));
        ps.execute();
        JDBCUtils.close(connection,ps);
    }
}
