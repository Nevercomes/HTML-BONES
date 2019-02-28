package com.p2c.html_bones.domain;

public class Eval_text {
    private int text_id;
    private int eval_id;
    private String text_url;

    public int getEval_id() {
        return eval_id;
    }
    public void setEval_id(int eval_id){
        this.eval_id = eval_id;
    }

    public int getText_id(){
        return text_id;
    }
    public void setText_id(int text_id){
        this.text_id = text_id;
    }

    public String getText_url(){
        return text_url;
    }
    public void setText_url(String text_url){
        this.text_url = text_url;
    }
}
