package com.api.financescontrol.services;

import com.api.financescontrol.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements AccountFacade{

    @Autowired
    AccountRepository accountRepository;

}
