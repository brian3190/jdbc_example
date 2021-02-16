package com.brian.jdbc_example;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {
    public static void main(String... args){
        DatabaseConnectionmanager dcm = new DatabaseConnectionManager("localhost", "sampledb", "postgres","password");
    }
    try{
        Connection connection = dcm.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM CUSTOMER");
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1));
        }
    } catch (
    SQLException e){
        e.printStackTrace();
    }
}
