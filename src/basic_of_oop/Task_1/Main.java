package basic_of_oop.Task_1;

import basic_of_oop.Task_1.entity.Directory;
import basic_of_oop.Task_1.service.DirectoryService;
import basic_of_oop.Task_1.service.TextFileService;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("C:");
        TextFileService textFileService = new TextFileService();

        System.out.println("Создать файл.");
        textFileService.createTextFile("Name1", dir, "Name1 content.");
        textFileService.createTextFile("Name2", dir, "Name2 content.");
        textFileService.createTextFile("Name3", dir, "Name3 content.");

        System.out.println("\nПереименование.");
        DirectoryService.printFiles(dir);
        textFileService.renameFile(DirectoryService.getFile(dir, 1), "NewName2");
        System.out.println();
        DirectoryService.printFiles(dir);

        System.out.println("\nПоказать содержимое файла.");
        textFileService.printFile(DirectoryService.getFile(dir, 0));
        textFileService.printFile(DirectoryService.getFile(dir, 1));
        textFileService.printFile(DirectoryService.getFile(dir, 2));

        System.out.println("\nДополнение файла.");
        textFileService.addToFile(DirectoryService.getFile(dir, 0), "Some new content for Name1");

        System.out.println("Файл после дополнения.");
        textFileService.printFile(DirectoryService.getFile(dir, 0));

        System.out.println("\nУдаление.");
        DirectoryService.deleteFile(dir, "Name3");

        System.out.println("Результат: ");
        DirectoryService.printFiles(dir);
    }
}
