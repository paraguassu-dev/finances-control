package com.api.financescontrol.controllers;

import com.api.financescontrol.dtos.ExpenseDTO;
import com.api.financescontrol.models.Expense;
import com.api.financescontrol.services.ExpenseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<Object> createExpense(@RequestBody @Valid ExpenseDTO expenseDTO){
        var expense = new Expense();
        BeanUtils.copyProperties(expenseDTO, expense);
        expense.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));

        return ResponseEntity.status(HttpStatus.CREATED).body(expenseService.save(expense));
    }

}
