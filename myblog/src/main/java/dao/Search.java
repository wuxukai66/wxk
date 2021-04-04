package dao;

import utils.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
    public int search(String username,String password) throws SQLException {

        Connection connection= jdbc.getConnection();
        String sql="select * from userinfo where username=? and pwd=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,username);
        statement.setString(2,password);
       ResultSet result=statement.executeQuery();
        if(!result.next()){
            return -1;
        }
        return 1;
    }




}
