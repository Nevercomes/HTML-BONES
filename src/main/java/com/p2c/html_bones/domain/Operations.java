package com.p2c.html_bones.domain;

import java.sql.Date;
import java.sql.Time;

public class Operations {
    private int ops_id;
    private int acc_id;
    private Time ops_time;
    private Date ops_date;

    public int getOps_id(){
        return ops_id;
    }
    public void setOps_id(int ops_id){
        this.ops_id = ops_id;
    }

    public int getAcc_id(){
        return acc_id;
    }
    public void setAcc_id(int acc_id){
        this.acc_id = acc_id;
    }


    public Time getOps_time() {
        return ops_time;
    }

    public void setOps_time(Time ops_time) {
        this.ops_time = ops_time;
    }

    public Date getOps_date() {
        return ops_date;
    }

    public void setOps_date(Date ops_date) {
        this.ops_date = ops_date;
    }
}
