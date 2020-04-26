package com.company.GuiaObjetos02.Consigna03;

import com.company.Common.AppParameters;

public class AccountTransactionLog {
    private Account account;
    private BankCustomer customer;
    private String description;
    private float transactionAmount;
    private int logType;

    //Se restringe el constructor y getters y setters para que la unica manera de crear el log sea a travez de una operación

    private AccountTransactionLog(Account account, BankCustomer customer, String description, float transactionAmount, int logType) {
        this.account = account;
        this.customer = customer;
        this.description = description;
        this.transactionAmount = transactionAmount;
        if(logType != AppParameters.logTypeDeposit && logType != AppParameters.logTypeExtraction)
            throw new IllegalArgumentException("Error: Unknown logType.");
        else
            this.logType = logType;
    }

    public Account getAccount() {
        return account;
    }

    public BankCustomer getCustomer() {
        return customer;
    }

    public int getLogType() {
        return logType;
    }

    public String getDescription() {
        return description;
    }

    public static AccountTransactionLog createExtractionLog(Account account, BankCustomer customer, float amount){
        return new AccountTransactionLog(
                account,
                customer,
                "Extracción: El cliente " + customer.getName() + ", retiró $" + amount,
                amount,
                AppParameters.logTypeExtraction);
    }

    public static AccountTransactionLog createDepositLog(Account account, BankCustomer customer, float amount){
        return new AccountTransactionLog(
                account,
                customer,
                "Deposito: El cliente " + customer.getName() + ", depositó $" + amount,
                amount,
                AppParameters.logTypeDeposit);
    }

}
