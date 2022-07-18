package com.api.financescontrol.services;

import com.api.financescontrol.models.Expense;
import com.api.financescontrol.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ExpenseService implements ExpenseFacade{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    @Transactional
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }
}
