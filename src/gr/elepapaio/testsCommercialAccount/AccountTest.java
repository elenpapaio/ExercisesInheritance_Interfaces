package gr.elepapaio.testsCommercialAccount;

import gr.elepapaio.commercialAccount.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        account = new Account("Eleni",100,0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        account.withdraw(30);
        assertEquals(70,account.getBalance(),"Something went wrong, the balance should be 70!");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        account.deposit(170);
        assertEquals(270,account.getBalance(),"Something went wrong, the balance should be 270!");
    }
}