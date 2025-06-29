package org.halimah.account;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTestMockito {

    //This will create a mock object through an annotation
    @Mock
    private AccountManager mockAccountManager;

    @Test
    void testTransferOk() {
        //1. SETUP 2 ACCOUNTS BETWEEN WHICH MONEY WILL BE TRANSFERRED
        Account senderAccount = new Account("1", 200L);
        Account beneficiaryAccount = new Account("2", 100L);

        //2. WE DECLARE EXPECTATION USING THE WHEN METHOD
        //lENIENT METHOD MODIFIES STRICTNESS OF OBJECT MOCKING
        Mockito.lenient()
                .when(mockAccountManager.findAccountForUser("1"))
                .thenReturn(senderAccount);

        //3. WE DECLARE EXPECTATIONS USING THE WHEN METHOD
        //lENIENT METHOD MODIFIES STRICTNESS OF OBJECT MOCKING
        Mockito.lenient()
                .when(mockAccountManager.findAccountForUser("2"))
                .thenReturn(beneficiaryAccount);

        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1", "2", 50);

        assertEquals(150, senderAccount.getBalance());
        assertEquals(150, beneficiaryAccount.getBalance());
    }
}
