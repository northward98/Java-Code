package jdbc;

import utils.JDBCUtils;

import java.sql.*;

/**
 * 通用查询操作
 */

public class Select {
    public void select(String sql, Object... args) throws Exception {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String sex = rs.getString(3);
                Date date = rs.getDate(4);
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs,ps,connection);
        }
    }
}
