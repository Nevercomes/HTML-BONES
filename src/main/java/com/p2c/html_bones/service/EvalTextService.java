package com.p2c.html_bones.service;

import com.p2c.html_bones.domain.Eval_text;
import com.p2c.html_bones.persistence.Eval_textDAO;
import com.p2c.html_bones.persistence.Impl.Eval_textDAOImpl;

public class EvalTextService {
    private Eval_textDAO eval_textMapper;

    public EvalTextService(){
        eval_textMapper = new Eval_textDAOImpl();
    }

    public void insertEvalText(Eval_text eval_text){
        eval_textMapper.insertEval_text(eval_text);
    }
}
