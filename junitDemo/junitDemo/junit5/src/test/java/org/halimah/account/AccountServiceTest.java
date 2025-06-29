package org.halimah.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    @Test
    void testTransferOk() {
        //1. SETUP
        Account senderAccount = new Account("1", 200L);
        Account beneficiaryAccount = new Account("2", 100L);

        MockAccountManager mockAccountManager = new MockAccountManager();
        mockAccountManager.addAccount("1", senderAccount);
        mockAccountManager.addAccount("2", beneficiaryAccount);

        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);

        //2. EXECUTION
        accountService.transfer("1", "2", 50);

        //3. RESULTS
        assertEquals(150, senderAccount.getBalance());
        assertEquals(150, beneficiaryAccount.getBalance());
    }
}