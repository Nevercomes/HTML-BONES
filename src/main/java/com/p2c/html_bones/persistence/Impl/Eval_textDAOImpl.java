package com.p2c.html_bones.persistence.Impl;

import com.p2c.html_bones.common.config.DBUtil;
import com.p2c.html_bones.domain.Eval_text;
import com.p2c.html_bones.persistence.Eval_textDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Eval_textDAOImpl implements Eval_textDAO {
    private static final String insertEval_textString = "INSERT INTO EVAL_TEXT (TEXT_ID,EVAL_ID,TEXT_URL) VALUES(?,?,?)";

    @Override
    public void insertEval_text(Eval_text eval_text){
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertEval_textString);
            preparedStatement.setInt(1, eval_text.getText_id());
            preparedStatement.setInt(2, eval_text.getEval_id());
            preparedStatement.setString(3, eval_text.getText_url());
            preparedStatement.executeUpdate();
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
