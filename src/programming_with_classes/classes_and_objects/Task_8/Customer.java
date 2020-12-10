package programming_with_classes.classes_and_objects.Task_8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String surname, String name, String patronymic, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id = " + id +
                ", фамилия = '" + surname + '\'' +
                ", имя = '" + name + '\'' +
                ", отчество = '" + patronymic + '\'' +
                ", creditCardNumber = " + creditCardNumber +
                ", bankAccountNumber = " + bankAccountNumber +
                '}';
    }

}
