package programming_with_classes.classes_and_objects.Task_3;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("Иванов И.И", 12, new int[]{9, 10, 9, 10, 9});
        students[1] = new Student("Петров П.П.", 11, new int[] {4, 4, 4, 4, 4});
        students[2] = new Student("Сидоров И.К.", 13, new int[] {4, 5, 6, 4, 7});
        students[3] = new Student("Золотов Д.И.", 14, new int[] {5, 7, 9, 10, 8});
        students[4] = new Student("Козлов В.Ф.", 13, new int[] {10, 10, 9, 10, 10});
        students[5] = new Student("Васильев А.А.", 12, new int[]{10, 10, 10, 10, 10});
        students[6] = new Student("Ивончик А.А.", 13, new int[]{6, 8, 10, 7, 4});
        students[7] = new Student("Василюк П.Р.", 11, new int[]{7, 8, 6, 5, 4});
        students[8] = new Student("Протченко И.А.", 14, new int[]{7, 10, 9, 8, 7});
        students[9] = new Student("Джобс С.П.", 14, new int[]{8, 9, 9, 9, 9});
        System.out.println("Список студентов: ");
        for (Student student:students) {
            student.printStudent();
        }

        System.out.println("\nЛучшие студенты: ");
        for (Student student:students) {
            student.printGreatStudent();
        }

    }

}
