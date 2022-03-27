package jdbc;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 演示批处理
 */

public class Batch_ {
    public void batch() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.addBatch();
            //当有1000条记录时，在批量执行
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                //清空
                preparedStatement.clearBatch();
            }
        }
        JDBCUtils.close(null, preparedStatement, connection);
    }
}
