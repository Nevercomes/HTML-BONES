package com.p2c.html_bones.persistence.Impl;

import com.p2c.html_bones.common.config.DBUtil;
import com.p2c.html_bones.domain.Operations;
import com.p2c.html_bones.persistence.OperationsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OperationsDAOImpl implements OperationsDAO {
    private static final String insertOperationsString = "INSERT INTO OPERATIONS (OPS_ID,ACC_ID,OPS_TIME,OPS_DATE) VALUES(?,?,?,?)";

    @Override
    public void insertOperations(Operations operations){
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertOperationsString);
            preparedStatement.setInt(1, operations.getOps_id());
            preparedStatement.setInt(2, operations.getAcc_id());
            preparedStatement.setTime(3,operations.getOps_time());
            preparedStatement.setDate(4, operations.getOps_date());
            preparedStatement.executeUpdate();
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
