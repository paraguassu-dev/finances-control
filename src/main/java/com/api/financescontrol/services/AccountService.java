package com.api.financescontrol.services;

import com.api.financescontrol.models.Account;
import com.api.financescontrol.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AccountService implements AccountFacade{

    @Autowired
    AccountRepository accountRepository;

    @Override
    @Transactional
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
