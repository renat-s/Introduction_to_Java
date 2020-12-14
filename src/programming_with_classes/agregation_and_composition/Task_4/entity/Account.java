package programming_with_classes.agregation_and_composition.Task_4.entity;

public class Account {
    private int accNumber;
    private int balance;
    private boolean accStatus;

    public Account(){}

    public Account(int accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.accStatus= true;

    }

    public boolean checkAccStatus() {
        return accStatus;
    }

    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", accStatus=" + accStatus +
                '}';
    }
}
