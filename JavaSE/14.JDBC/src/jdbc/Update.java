package jdbc;

import utils.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 通用的增删改操作
 */

public class Update {

    public void update(String sql, Object... args) throws Exception {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);//sql从1开始，数组从0开始
            }
            ps.execute();//执行
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(connection,ps);
        }
    }
}
