package com.company.GuiaObjetos02.Consigna03;

import com.company.GuiaObjetos02.Common.AppParameters;

import java.util.ArrayList;
import java.util.UUID;

public class Account {
    private UUID id;
    private float balance;
    private BankCustomer bankCustomer;
    private boolean allowCredit;
    private ArrayList<AccountTransactionLog> accountLogs;

    public Account(float balance, BankCustomer bankCustomer, boolean allowCredit) {
        this.id = UUID.randomUUID();
        this.bankCustomer = bankCustomer;
        this.allowCredit = allowCredit;
        this.accountLogs = new ArrayList<AccountTransactionLog>();
        makeDeposit(balance); //Se utiliza metodo para que quede creado el Log
    }

    public UUID getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public BankCustomer getBankCustomer() {
        return bankCustomer;
    }

    public void setBankCustomer(BankCustomer bankCustomer) {
        this.bankCustomer = bankCustomer;
    }

    public void makeDeposit(float amount){
        this.balance += amount;
        this.accountLogs.add(AccountTransactionLog.createDepositLog(this, this.bankCustomer, amount));
    }

    public void makeExtraction(float amount){
        if(this.balance >= amount)
            this.balance -= amount;
        else if(this.allowCredit && this.balance - amount >= AppParameters.bankAccountMaxCreditAmount){
            this.balance -= amount;
        }else
            throw new IllegalStateException("Error: The selected account doesn't have that much money. Do you want a loan ? :)");
        this.accountLogs.add(AccountTransactionLog.createExtractionLog(this, this.bankCustomer, amount));
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", customer=" + bankCustomer.toString() +
                '}';
    }

    public String showLogs(){
        String ret = "";
        for(AccountTransactionLog transaction : this.accountLogs){
            ret += transaction.getDescription() + "\n";
        }
        return ret;
    }
}
