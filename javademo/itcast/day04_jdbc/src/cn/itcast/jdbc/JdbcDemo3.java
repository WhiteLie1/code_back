package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1=null;
        PreparedStatement pstmt2=null;
        // 1.获取连接
        try {
             conn = JDBCUtils.getConnection();
             // 开启事务
            conn.setAutoCommit(false);
             // 2.定义sql
            // 2.1 张三-500
            String sql1 = "update account set balance = balance- ? where id = ?";
            // 2.2 李四+500
            String sql2 = "update account set balance = balance+ ? where id = ?";

             pstmt1 = conn.prepareStatement(sql1);
             pstmt2 = conn.prepareStatement(sql2);
             // 4.设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            // 事务回滚
            try {
                if(conn!=null)
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,conn);
        }
    }
}
