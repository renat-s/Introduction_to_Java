package basic_of_oop.Task_1.service;

import basic_of_oop.Task_1.entity.Directory;
import basic_of_oop.Task_1.entity.File;
import basic_of_oop.Task_1.entity.TextFile;

public class DirectoryService {
    public static File getFile(Directory dir, int index) {
        return dir.getFiles().get(index);
    }

    public static void addFile(Directory dir, File file) {
        dir.getFiles().add(file);
    }

    public static void deleteFile(Directory dir, String fileName) {
        for (File file : dir.getFiles()) {
            if (file.getName().equals(fileName)) {
                dir.getFiles().remove(file);
                break;
            }
        }
    }

    public static void printFiles(Directory dir) {
        for (File file : dir.getFiles()) {
            System.out.println(file.getName() + "." + file.getType() + " Сдержимое файла: " + ((TextFile)file).getData());
        }
    }

}
