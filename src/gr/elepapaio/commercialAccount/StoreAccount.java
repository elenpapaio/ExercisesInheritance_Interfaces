package gr.elepapaio.commercialAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreAccount extends Account {
    private String storeName;
    private String accountCategory;
    private static final List<String> categoryType=new ArrayList<String>(Arrays.asList("basic", "mid", "extra", "premium"));


    public StoreAccount(String owner, double balance, int numberOfTransactions, String storeName, String accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public StoreAccount() {
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }


    public void changeCategory(String category) {

        if (categoryType.contains(category)){
            accountCategory = category;
        }
        else{
            System.out.println("Invalid category");
        }

    }
}
