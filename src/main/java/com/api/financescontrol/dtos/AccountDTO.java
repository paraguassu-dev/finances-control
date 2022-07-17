package com.api.financescontrol.dtos;

import javax.validation.constraints.NotBlank;

public class AccountDTO {

    @NotBlank
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
