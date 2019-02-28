package com.p2c.html_bones.persistence.Impl;

import com.p2c.html_bones.common.config.DBUtil;
import com.p2c.html_bones.domain.Image;
import com.p2c.html_bones.persistence.ImageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageDAOImpl implements ImageDAO {

    private static String getImageUrlByImageIdString = "SELECT image.img_url FROM IMAGE WHERE image.img_id=?";

    private static String insertImageString = "INSERT INTO IMAGE (IMG_ID,OPS_ID,IMG_TYPE,IMG_URL) VALUES(?,?,?,?)";

    @Override
    public String getImageUrlByImageId(int imgId)
    {
        String imageUrl = null;
        try {
            Connection connection= DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(getImageUrlByImageIdString);
            preparedStatement.setInt(1, imgId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                imageUrl = resultSet.getString(1);
            }

            DBUtil.closeResultSet(resultSet);
            DBUtil.closePreparedStatement(preparedStatement);
            DBUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imageUrl;
    }

    @Override
    public void insertImage(Image image)
    {
        if(image == null)
        {
            return;
        }
        else {
            try {
                Connection connection = DBUtil.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(insertImageString);
                preparedStatement.setInt(1, image.getImg_id());
                preparedStatement.setInt(2, image.getOps_id());
                preparedStatement.setString(3, image.getImg_type());
                preparedStatement.setString(4,image.getImg_url());
                preparedStatement.executeUpdate();
                DBUtil.closePreparedStatement(preparedStatement);
                DBUtil.closeConnection(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
