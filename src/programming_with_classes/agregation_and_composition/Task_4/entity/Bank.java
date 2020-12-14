package programming_with_classes.agregation_and_composition.Task_4.entity;

import java.util.Arrays;

public class Bank {
    private Client[] clients;

    public Bank(Client... clients) {
        this.clients = clients;

    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client... clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return String.format("Bank{" +
                "clients=" + Arrays.toString(clients) +
                '}');
    }
}
