package programming_with_classes.classes_and_objects.Task_3;

public class Student {
    private String name;
    private int groupNumber;
    private int [] marks;

    public Student(String name, int groupNumber, int[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void printStudent() {
        System.out.println("Студент: " + getName() + " Группа: " + getGroupNumber());
    }

    public void printGreatStudent() {
        int counter = 0;

        for (int i = 0; i < getMarks().length; i++) {
            if (getMarks()[i] > 8) {
                counter++;
            }
        }

        if (counter == marks.length) {
            printStudent();
        }
    }
}
