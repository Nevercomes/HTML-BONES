package com.p2c.html_bones.service;

import com.p2c.html_bones.domain.Image;
import com.p2c.html_bones.persistence.AccountDAO;
import com.p2c.html_bones.persistence.ImageDAO;
import com.p2c.html_bones.persistence.Impl.AccountDAOImpl;
import com.p2c.html_bones.persistence.Impl.ImageDAOImpl;
import com.p2c.html_bones.persistence.Impl.SequenceDAOImpl;
import com.p2c.html_bones.persistence.SequenceDAO;

public class ImageService {
    private AccountDAO accountMapper;
    private SequenceDAO sequenceMapper;
    private ImageDAO imageMapper;

    public ImageService(){
        accountMapper = new AccountDAOImpl();
        sequenceMapper = new SequenceDAOImpl();
        imageMapper = new ImageDAOImpl();
    }

    //插入图片
    public void insertImage(Image image)
    {
        imageMapper.insertImage(image);
    }
}
