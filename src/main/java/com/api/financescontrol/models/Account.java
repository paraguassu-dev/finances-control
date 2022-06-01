package com.api.financescontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ACCOUNTS")
public class Account implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private static double balance;

    public UUID getId() {
        return id;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }
}
