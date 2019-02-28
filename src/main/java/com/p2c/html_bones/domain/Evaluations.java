package com.p2c.html_bones.domain;

public class Evaluations {
    private int eval_id;
    private int ops_id;
    private String eval_grade;

    public int getEval_id(){
        return eval_id;
    }
    public void setEval_id(int eval_id){
        this.eval_id = eval_id;
    }

    public int getOps_id(){
        return ops_id;
    }
    public void setOps_id(int ops_id){
        this.ops_id = ops_id;
    }

    public String getEval_grade(){
        return eval_grade;
    }
    public void setEval_grade(String eval_grade){
        this.eval_grade = eval_grade;
    }
}
