package cn.itcast.datasource.druid;


import cn.itcast.datasource.utils.JDBCUtils;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {
    public static void main(String[] args) throws Exception {
        /**
         * 完成添加工作，给Account表添加一条记录
         *
         */
       Connection conn = null;
       PreparedStatement pstmt = null;
        // 1.获取连接
         conn = JDBCUtils.getConnection();
        // 2.定义sql
        String sql = "insert into account values(3,?,?)";
        // 3.获取pstmt对象
         pstmt = conn.prepareStatement(sql);
        // 4.给 ？ 赋值
        pstmt.setString(1,"王五");
        pstmt.setDouble(2,3000);
        // 5.执行sql
        int count = pstmt.executeUpdate();
        System.out.println(count);


    }
}
