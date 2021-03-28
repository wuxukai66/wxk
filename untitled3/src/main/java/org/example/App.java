package org.example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        //1.获得DateSource
        MysqlDataSource dataSource=new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/maventext?useSSL=false&charactionEncoding=utf8");
        dataSource.setUser("root");
        dataSource.setPassword("wuxukai");
        Connection connection=dataSource.getConnection();
        String sql="select * from student where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,2);
        ResultSet result=statement.executeQuery();
        while(result.next()){
            System.out.println("查询的数据name:"+
                    result.getString("name"));
        }
        result.close();
        statement.close();
        connection.close();

    }
}
