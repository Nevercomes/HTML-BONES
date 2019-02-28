package com.p2c.html_bones.service;

import com.p2c.html_bones.domain.Operations;
import com.p2c.html_bones.persistence.AccountDAO;
import com.p2c.html_bones.persistence.Impl.AccountDAOImpl;
import com.p2c.html_bones.persistence.Impl.OperationsDAOImpl;
import com.p2c.html_bones.persistence.Impl.SequenceDAOImpl;
import com.p2c.html_bones.persistence.OperationsDAO;
import com.p2c.html_bones.persistence.SequenceDAO;

public class OperationsService {
    private AccountDAO accountMapper;
    private SequenceDAO sequenceMapper;
    private OperationsDAO operationsMapper;

    public OperationsService()
    {
        accountMapper = new AccountDAOImpl();
        sequenceMapper = new SequenceDAOImpl();
        operationsMapper = new OperationsDAOImpl();
    }

    public void insertOperation(Operations operations)
    {
         operationsMapper.insertOperations(operations);
    }
}
