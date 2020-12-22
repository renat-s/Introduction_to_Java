package basic_of_oop.Task_4.entity;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {
    private static final long serialVersionUID = 7339503919851318841L;
    private String name;
    private int price;
    private String description;

    public Treasure() {
    }

    public Treasure(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return Double.compare(treasure.price, price) == 0 &&
                name.equals(treasure.name) &&
                Objects.equals(description, treasure.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
