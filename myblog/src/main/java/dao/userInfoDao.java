package dao;

import utils.jdbc;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userInfoDao {
    public int add(String username,String password) throws SQLException {
        int result=0;
        Connection connection= jdbc.getConnection();
        String sql="insert into userinfo(username,pwd) values (?,?)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,username);
        statement.setString(2,password);
        result = statement.executeUpdate();
        return result;
    }


}
