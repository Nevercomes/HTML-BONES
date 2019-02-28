package com.p2c.html_bones.service;

import com.p2c.html_bones.domain.Account;
import com.p2c.html_bones.domain.Sequence;
import com.p2c.html_bones.persistence.AccountDAO;
import com.p2c.html_bones.persistence.Impl.AccountDAOImpl;
import com.p2c.html_bones.persistence.Impl.SequenceDAOImpl;
import com.p2c.html_bones.persistence.SequenceDAO;

public class AccountService {


  private AccountDAO accountMapper;
  private SequenceDAO sequenceMapper;

  public AccountService(){
    accountMapper = new AccountDAOImpl();
    sequenceMapper = new SequenceDAOImpl();
  }

  public Account getAccount(String username) {
    return accountMapper.getAccountByUsername(username);
  }

  public Account getAccount(String username, String password) {
    Account account = new Account();
    account.setUsername(username);
    account.setPassword(password);
    return accountMapper.getAccountByUsernameAndPassword(account);
  }


  public void insertAccount(Account account) {
    account.setUserId(getNextId("account_id"));
    accountMapper.insertAccount(account);
//    accountMapper.insertSignon(account);
  }


  public int getNextId(String name) {
    Sequence sequence = new Sequence(name, -1);
    sequence = (Sequence) sequenceMapper.getSequence(sequence);
    if (sequence == null) {
      throw new RuntimeException("Error: A null sequence was returned from the database (could not get next " + name
              + " sequence).");
    }
    Sequence parameterObject = new Sequence(name, sequence.getNextId() + 1);
    sequenceMapper.updateSequence(parameterObject);
    return sequence.getNextId();
  }


//  public void updateAccount(Account account) {
//    accountMapper.updateAccount(account);
//
//    if (account.getPassword() != null && account.getPassword().length() > 0) {
//      accountMapper.updateSignon(account);
//    }
//  }

}
