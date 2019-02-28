package com.p2c.html_bones.persistence.Impl;

import com.p2c.html_bones.common.config.DBUtil;
import com.p2c.html_bones.domain.Evaluations;
import com.p2c.html_bones.persistence.EvaluationsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EvaluationsDAOImpl implements EvaluationsDAO {
    private static final String insertEvaluationsString = "INSERT INTO EVALUATIONS (EVAL_ID,OPS_ID,EVAL_GRADE) VALUES(?,?,?)";

    @Override
    public void insertEvalustions(Evaluations evaluations){
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertEvaluationsString);
            preparedStatement.setInt(1, evaluations.getEval_id());
            preparedStatement.setInt(2, evaluations.getOps_id());
            preparedStatement.setString(3, evaluations.getEval_grade());
            preparedStatement.executeUpdate();
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
