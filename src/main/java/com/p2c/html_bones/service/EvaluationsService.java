package com.p2c.html_bones.service;

import com.p2c.html_bones.domain.Evaluations;
import com.p2c.html_bones.persistence.EvaluationsDAO;
import com.p2c.html_bones.persistence.Impl.EvaluationsDAOImpl;

public class EvaluationsService {

    private EvaluationsDAO evaluationsMapper;

    public EvaluationsService(){
        evaluationsMapper = new EvaluationsDAOImpl();
    }

    public void insertEvaluations(Evaluations evaluation){
        evaluationsMapper.insertEvalustions(evaluation);
    }
}
