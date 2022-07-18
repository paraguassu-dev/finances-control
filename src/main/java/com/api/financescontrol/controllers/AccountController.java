package com.api.financescontrol.controllers;

import com.api.financescontrol.dtos.AccountDTO;
import com.api.financescontrol.dtos.ExpenseDTO;
import com.api.financescontrol.models.Account;
import com.api.financescontrol.models.Expense;
import com.api.financescontrol.services.AccountService;
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
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping
    public ResponseEntity<Object> createAccount(@RequestBody @Valid AccountDTO accountDTO){
        var account = new Account();
        BeanUtils.copyProperties(accountDTO, account);

        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.save(account));
    }

}
