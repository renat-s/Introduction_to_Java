package programming_with_classes.classes_and_objects.Task_9;

public class Book {
    private static int idStart = 1;
    private int id;
    private String name;
    private String publishingHouse;
    private String author;
    private int year;
    private int numberOfPages;
    private int cost;
    private String bindingType;

    public Book(String name, String publishingHouse, String author, int year, int numberOfPages, int cost, String bindingType) {
        this.id = idStart++;
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", название = '" + name + '\'' +
                ", автор = '" + author + '\'' +
                ", издательство = '" + publishingHouse + '\'' +
                ", год издательства = " + year +
                ", количество страниц = " + numberOfPages +
                ", цена = " + cost + " usd" +
                ", переплет = '" + bindingType + '\'' +
                '}';
    }

}
