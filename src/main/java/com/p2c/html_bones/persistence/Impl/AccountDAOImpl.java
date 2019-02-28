package com.p2c.html_bones.persistence.Impl;

import com.p2c.html_bones.common.config.DBUtil;
import com.p2c.html_bones.domain.Account;
import com.p2c.html_bones.persistence.AccountDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAOImpl implements AccountDAO
{
   /* private static final String getAccountByUsernameString = "SELECT SIGNON.USERNAME,ACCOUNT.EMAIL,"
            + "ACCOUNT.FIRSTNAME,ACCOUNT.LASTNAME,ACCOUNT.STATUS,ACCOUNT.ADDR1 AS address1,"
            + "ACCOUNT.ADDR2 AS address2,ACCOUNT.CITY,ACCOUNT.STATE,ACCOUNT.ZIP,"
            + "ACCOUNT.COUNTRY,ACCOUNT.PHONE,PROFILE.LANGPREF AS languagePreference,"
            + "PROFILE.FAVCATEGORY AS favouriteCategoryId,PROFILE.MYLISTOPT AS listOption,"
            + "PROFILE.BANNEROPT AS bannerOption,BANNERDATA.BANNERNAME FROM ACCOUNT, PROFILE, SIGNON, "
            + "BANNERDATA WHERE ACCOUNT.USERID = ? AND SIGNON.PASSWORD = ACCOUNT.PASSWORD "
            + "AND SIGNON.USERNAME = ACCOUNT.USERID AND PROFILE.USERID = ACCOUNT.USERID"
            + "AND PROFILE.FAVCATEGORY = BANNERDATA.FAVCATEGORY";*/
   private static final String getAccountByUsernameString = "SELECT ACCOUNT.ACC_ID,account.ACC_NAME,ACCOUNT.ACC_PASSWORD FROM ACCOUNT WHERE ACCOUNT.ACC_NAME =?";

    private static final String getAccountByUsernameAndPasswordString="SELECT ACCOUNT.ACC_ID,account.acc_name,account.acc_password FROM ACCOUNT WHERE ACCOUNT.ACC_NAME =? AND ACCOUNT.ACC_PASSWORD =?";
    private static final String insertAccountString = "INSERT INTO ACCOUNT (ACC_ID,ACC_NAME,ACC_PASSWORD) VALUES(?,?,?)";
//    private static final String insertSignonString = "INSERT INTO SIGNON (PASSWORD,USERNAME) VALUES (?,?)";
//    private static final String updateAccountString = "UPDATE ACCOUNT SET EMAIL = ?, FIRSTNAME = ?,LASTNAME = ?,STATUS = ?,"
//            + "ADDR1 = ?,ADDR2 = ?,CITY = ?,STATE = ?,ZIP = ?,COUNTRY = ?,PHONE = ? WHERE USERID = ?";;
//    private static final String updateSignonString = "UPDATE SIGNON SET PASSWORD = ? WHERE USERNAME = ?";

    @Override
    public Account getAccountByUsername(String username) {
        Account account = null;
        try {
            Connection connection= DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(getAccountByUsernameString);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                account = new Account();
                account.setUserId(resultSet.getInt(1));
                account.setUsername(resultSet.getString(2));
                account.setPassword(resultSet.getString(3));

            }

            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public Account getAccountByUsernameAndPassword(Account account) {
        Account account2 = null;

        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(getAccountByUsernameAndPasswordString);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                account2 = new Account();
                account2.setUserId(resultSet.getInt(1));
                account2.setUsername(resultSet.getString(2));
                account2.setPassword(resultSet.getString(3));

            }

            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return account2;
    }

    @Override
    public void insertAccount(Account account) {
        try {
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertAccountString);
            preparedStatement.setInt(1, account.getUserId());
            preparedStatement.setString(2, account.getUsername());
            preparedStatement.setString(3, account.getPassword());
            preparedStatement.executeUpdate();
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public void insertProfile(Account account) {
//        try {
//            Connection connection = DBUtil.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(insertProfileString);
//            preparedStatement.setString(3, account.getUsername());
//            preparedStatement.executeUpdate();
//            DBUtil.closePreparedStatement(preparedStatement);
//            DBUtil.closeConnection(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    @Override
//    public void insertSignon(Account account) {
//        try {
//            Connection connection = DBUtil.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(insertSignonString);
//            preparedStatement.setString(1, account.getPassword());
//            preparedStatement.setString(2, account.getUsername());
//            preparedStatement.executeUpdate();
//            DBUtil.closePreparedStatement(preparedStatement);
//            DBUtil.closeConnection(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    @Override
//    public void updateAccount(Account account) {
//        try {
//            Connection connection = DBUtil.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(updateAccountString);
//            preparedStatement.setString(12, account.getUsername());
//            preparedStatement.executeUpdate();
//            DBUtil.closePreparedStatement(preparedStatement);
//            DBUtil.closeConnection(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    @Override
//    public void updateProfile(Account account) {
//        try {
//            Connection connection = DBUtil.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(updateProfileString);
//            preparedStatement.setString(3, account.getUsername());
//            preparedStatement.executeUpdate();
//            DBUtil.closePreparedStatement(preparedStatement);
//            DBUtil.closeConnection(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    @Override
//    public void updateSignon(Account account) {
//        try {
//            Connection connection = DBUtil.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(updateSignonString);
//            preparedStatement.setString(1, account.getPassword());
//            preparedStatement.setString(2, account.getUsername());
//            preparedStatement.executeUpdate();
//            DBUtil.closePreparedStatement(preparedStatement);
//            DBUtil.closeConnection(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
