package com.api.financescontrol.services;

import com.api.financescontrol.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService implements ExpenseFacade{

    @Autowired
    ExpenseRepository expenseRepository;
}
