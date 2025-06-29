package org.halimah.account;

public class Account {
    private String accountId;
    private Long balance;

    //CONSTRUCTOR
    public Account(String accountId, Long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    //CREDIT ALERT
    public void credit(Long amount){
        this.balance += amount;
    }

    //DEBIT ALERT
    public void debit(Long amount){
        this.balance -= amount;
    }

    //CHECK ACCOUNT BALANCE
    public long getBalance(){
        return this.balance;
    }
}
