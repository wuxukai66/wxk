package dao;

import models.UserInfo;
import utils.jdbc;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userInfoDao {
    public int add(String username, String password) throws SQLException {
        int result = 0;
        Connection connection = jdbc.getConnection();
        String sql = "insert into userinfo(username,pwd) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        result = statement.executeUpdate();
        return result;
    }


    public UserInfo getUser(String username, String password) throws SQLException {
        UserInfo userInfo = new UserInfo();
        // jdbc 查询数据库
        Connection connection = jdbc.getConnection();
        String sql = "select * from userinfo where username=? and pwd=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        // 查询数据库
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            userInfo.setId(resultSet.getInt("id"));
            userInfo.setUsername(resultSet.getString("username"));
            userInfo.setPassword(resultSet.getString("pwd"));
            //..
        }
        // 关闭数据库连接
        jdbc.close(connection, statement, resultSet);
        return userInfo;
    }
}
