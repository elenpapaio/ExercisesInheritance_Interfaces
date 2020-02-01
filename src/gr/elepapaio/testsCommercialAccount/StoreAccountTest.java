package gr.elepapaio.testsCommercialAccount;

import gr.elepapaio.commercialAccount.StoreAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreAccountTest {
    private StoreAccount storeAccount;

    @BeforeEach
    void setUp() {
        storeAccount = new StoreAccount("Eleni",150,0,"Bookstore","basic");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void changeCategory() {
        storeAccount.changeCategory("mid");
        assertEquals("mid",storeAccount.getAccountCategory(),"It should be mid!");
    }

    @Test
    void withdraw(){
        storeAccount.withdraw(20);
        assertEquals(130,storeAccount.getBalance(),"It should be 130!");
    }

    @Test
    void deposit(){
        storeAccount.deposit(100);
        assertEquals(250,storeAccount.getBalance(),"It should be 250!");
    }
}