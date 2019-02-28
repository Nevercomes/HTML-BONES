package com.p2c.html_bones.persistence;

import com.p2c.html_bones.domain.Image;

public interface ImageDAO {
    //通过imageId来查imageUrl
    String getImageUrlByImageId(int imgId);

    //插入图片到数据库
    void insertImage(Image image);

}
