package basic_of_oop.Task_1.entity;

public class TextFile extends File {
    private String data;

    public TextFile(String name, String data) {
        super.setName(name);
        super.setType("txt");
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
