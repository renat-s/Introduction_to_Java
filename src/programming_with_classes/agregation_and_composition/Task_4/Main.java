package programming_with_classes.agregation_and_composition.Task_4;

import programming_with_classes.agregation_and_composition.Task_4.entity.Account;
import programming_with_classes.agregation_and_composition.Task_4.entity.Bank;
import programming_with_classes.agregation_and_composition.Task_4.entity.Client;
import programming_with_classes.agregation_and_composition.Task_4.service.AccountService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        Account account1 = new Account(111, 111);
        Account account2 = new Account(222, -222);
        Account account3 = new Account(333, 333);
        Account account4 = new Account(444, -444);
        Account account5 = new Account(555, -555);

        Client client1 = new Client("Сергей", account3, account1);
        Client client2 = new Client("Андрей", account5, account4);
        Client client3 = new Client("Дмитрий", account2);

        Bank bank = new Bank(client1, client2, client3);
        Account[] accounts = accountService.getAllAccount(bank);
        accountService.printAllAccount(bank);

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите № счета: ");
        int numAccount = sc.nextInt();
        accountService.printAccount(bank, accountService.findAccount(bank, numAccount));
        System.out.println();

        System.out.println("Введите № счета для блокировки: ");
        int blockAccNum = sc.nextInt();
        accountService.blockAccount(bank, blockAccNum);

        System.out.println();

        //сортировка
        accountService.printAllAccount(accountService.sortAllAccount(accounts));
        System.out.println();

        // сумма счетов каждого клиента
        for (Client client : bank.getClients()) {
            int sumClientAccount = accountService.printSumClientAccount(client);
            System.out.println("Суммарный баланс клиента " + client.getName() + " = " + sumClientAccount);
        }
        System.out.println();

        // общий суммарный баланс всех клиента
        int sumAllClientAccount = accountService.printSumAllAccount(accounts);
        System.out.println("Суммарный баланс всех клиентов " + " = " + sumAllClientAccount);


        //Сумма счетов с положительным балансом
        int sumPos = accountService.printTotalPositiveSum(accounts);
        System.out.println("Сумма всех счетов с  положительным балансом " + sumPos);

        //Сумма счетов с отрицательным балансом
        int sumNeg = accountService.printTotalNegativeSum(accounts);
        System.out.println("Сумма всех счетов с  отрицательным балансом " + sumNeg);
    }

}
