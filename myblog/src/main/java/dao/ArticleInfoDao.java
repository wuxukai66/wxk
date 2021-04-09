package dao;

import models.ArticleInfo;
import utils.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleInfoDao {
    public List<ArticleInfo> getListByUID(int uid) throws SQLException {
        List<ArticleInfo> list = new ArrayList<>();
        Connection connection = jdbc.getConnection();
        String sql = "select * from article where uid=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, uid);
        // 查询数据库并返回结果
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            ArticleInfo articleInfo = new ArticleInfo();
            articleInfo.setId(resultSet.getInt("id"));
            articleInfo.setRcount(resultSet.getInt("rcount"));
            articleInfo.setTitle(resultSet.getString("title"));
            articleInfo.setContent(resultSet.getString("Content"));
            articleInfo.setCreatetime(resultSet.getDate("createtime"));
            list.add(articleInfo);
        }
        return list;
    }
//文章删除
    public int del(int id) throws SQLException {
        int result=0;
        if(id>0){
            Connection connection=jdbc.getConnection();
            String sql="delete from article where id=?";
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            result=statement.executeUpdate();
            jdbc.close(connection,statement,null);
        }
        return result;
    }


    //文章修改
    public int upArt(int id,String title,String content) throws SQLException {
        int result=0;
        Connection connection=jdbc.getConnection();
        String sql="update article set title=?,content=? where id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,title);
        statement.setString(2,content);
        statement.setInt(3,id);
        result=statement.executeUpdate();
        jdbc.close(connection,statement,null);
        return result;
    }
//查询文章
    public ArticleInfo getArtById(int id) throws SQLException {
        ArticleInfo articleInfo = new ArticleInfo();
        if (id > 0) {
            Connection connection = jdbc.getConnection();
            String sql = "select * from article where id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                articleInfo.setId(resultSet.getInt("id"));
                articleInfo.setTitle(resultSet.getString("title"));
                articleInfo.setContent(resultSet.getString("content"));
            }
            jdbc.close(connection, statement, resultSet);
        }
        return articleInfo;
    }
    //文章新增
    public int add(String title, String content, int uid) throws SQLException {
        int result = 0;
        Connection connection = jdbc.getConnection();
        String sql = "insert into article(title,content,uid,`desc`) values(?,?,?,'')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, title);
        statement.setString(2, content);
        statement.setInt(3, uid);
        result = statement.executeUpdate();
        jdbc.close(connection, statement, null);
        return result;
    }
}
