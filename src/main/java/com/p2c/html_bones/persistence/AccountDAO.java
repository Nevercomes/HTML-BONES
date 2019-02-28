package com.p2c.html_bones.persistence;

import com.p2c.html_bones.domain.Account;

public interface AccountDAO {
    Account getAccountByUsername(String username);

    Account getAccountByUsernameAndPassword(Account account);

    void insertAccount(Account account);

//    void insertSignon(Account account);

//    void updateAccount(Account account);

//    void updateSignon(Account account);

}
