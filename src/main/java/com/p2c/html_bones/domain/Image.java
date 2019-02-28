package com.p2c.html_bones.domain;

import java.io.Serializable;

public class Image implements Serializable {
    private static final long serialVersionUID = 8751282105532159742L;

    private int img_id;
    private int ops_id;
    private String img_type;
    private String img_url;


    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public int getOps_id() {
        return ops_id;
    }

    public void setOps_id(int ops_id) {
        this.ops_id = ops_id;
    }

    public String getImg_type() {
        return img_type;
    }

    public void setImg_type(String img_type) {
        this.img_type = img_type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
