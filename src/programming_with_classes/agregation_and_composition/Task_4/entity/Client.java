package programming_with_classes.agregation_and_composition.Task_4.entity;

import java.util.Arrays;

public class Client {
    private String name;
    private Account[] account;

    public Client() {};

    public Client(String name, Account... account) {
        this.account = account;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccount() {
        return account;
    }

    public void setAccount(Account[] account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return String.format("Client{" +
                "account=" + Arrays.toString(account) +
                '}');
    }
}
