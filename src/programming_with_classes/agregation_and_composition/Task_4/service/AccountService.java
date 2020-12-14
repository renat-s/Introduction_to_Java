package programming_with_classes.agregation_and_composition.Task_4.service;

import programming_with_classes.agregation_and_composition.Task_4.entity.Account;
import programming_with_classes.agregation_and_composition.Task_4.entity.Bank;
import programming_with_classes.agregation_and_composition.Task_4.entity.Client;

public class AccountService {

    public AccountService() {
    }

    public void printAccount(Bank bank, Account account) {
        if (account.getAccNumber() != 0) {
            System.out.println("Номер аккаунта: " + account.getAccNumber() +
                    ", баланс: " + account.getBalance() +
                    ", статус аккаунта: " + account.checkAccStatus());
            System.out.println("Владелец: " + getClientByNumAccount(bank, account.getAccNumber()).getName());
        }
    }

    public void printAllAccount(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("Номер аккаунта: " + account.getAccNumber() +
                    ", баланс: " + account.getBalance() +
                    ", статус аккаунта: " + account.checkAccStatus());
        }

    }

    public void printAllAccount(Bank bank) {
        Account[] accounts = getAllAccount(bank);
        for (Account account : accounts) {
            System.out.println("Номер аккаунта: " + account.getAccNumber() +
                    ", баланс: " + account.getBalance() +
                    ", статус аккаунта: " + account.checkAccStatus());
        }

    }

    public Client getClientByNumAccount(Bank bank, int accountNumber) {
        Client clientByNum = new Client();
        for (Client client : bank.getClients()) {
            for (Account i : client.getAccount()){
                if (i.getAccNumber() == accountNumber) {
                    clientByNum = client;
                }
            }
        }

        return clientByNum;
    }

    public Account[] getAllAccount(Bank bank) {
        int i = 0;
        int j = -1;
        for (Client client : bank.getClients()) {
            for (int n = 0; n < client.getAccount().length; n++){
                i++;
            }
        }

        Account[] accounts = new Account[i];
        for (Client client : bank.getClients()) {
            for (Account account : client.getAccount()){
                j++;
                accounts[j] = account;
            }
        }
        return accounts;
    }

    public Account findAccount(Bank bank, int number) {
        Account accNumber = new Account();
        for (Client client : bank.getClients()) {
            for (Account i : client.getAccount()){
                if (i.getAccNumber() == number) {
                    accNumber = i;
                }
            }
        }
        if (accNumber.getAccNumber() == 0) {
            System.out.println("Аккаунт с таким номером отсутствует.");
        }
        return accNumber;
    }

    public Account findClientAccount(Client client, int number) {
        Account accNumber = null;
        for (Account i : client.getAccount()) {
            if (i.getAccNumber() == number) {
                accNumber = i;
            } else {
                System.out.println("Аккаунт с таким номером у данного клиента отсутствует.");
            }
        }

        return accNumber;
    }

    public void blockAccount(Bank bank, int accNum) {
        Account account = findAccount(bank, accNum);
        if (account.getAccNumber() != 0) {
            account.setAccStatus(false);
            System.out.println("Аккаунт заблокирован.");
        }
    }

    public void activateAccount(Client client, int accNum) {
        Account account = findClientAccount(client, accNum);
        account.setAccStatus(true);
    }

    public Account[] sortAllAccount(Account[] accounts) {
        Account tempAcc;

        for (int i = accounts.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (accounts[j].getAccNumber() > accounts[j + 1].getAccNumber()) {
                    tempAcc = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = tempAcc;
                }

            }
        }

        return accounts;
    }

    public Account[] sortClientAccount(Client client) {
        Account tempAcc;
        Account[] newSortAcc = new Account[client.getAccount().length];

        for (int i = client.getAccount().length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (client.getAccount()[j].getAccNumber() > client.getAccount()[j + 1].getAccNumber()) {
                    tempAcc = client.getAccount()[j];
                    client.getAccount()[j] = client.getAccount()[j + 1];
                    client.getAccount()[j + 1] = tempAcc;
                }

            }
        }

        return newSortAcc;
    }

    public int printSumClientAccount(Client client) {
        int sum = 0;

        for (Account i : client.getAccount()) {
            sum += i.getBalance();
        }
        return sum;
    }

    public int printSumAllAccount(Account[] accounts) {
        int sum = 0;

        for (Account i : accounts) {
            sum += i.getBalance();
        }
        return sum;
    }

    public int printTotalPositiveSum(Account[] accounts) {
        int sum = 0;

        for (Account i : accounts) {
            if (i.getBalance() > 0) {
                sum += i.getBalance();
            }
        }
        return sum;
    }

    public int printTotalNegativeSum(Account[] accounts) {
        int sum = 0;

        for (Account i : accounts) {
            if (i.getBalance() < 0) {
                sum += i.getBalance();
            }
        }
        return sum;
    }

}
