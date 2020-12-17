package basic_of_oop.Task_1.service;

import basic_of_oop.Task_1.entity.Directory;
import basic_of_oop.Task_1.entity.File;
import basic_of_oop.Task_1.entity.TextFile;

public class TextFileService extends FileService {
    public void createTextFile(String name, Directory dir, String data) {
        System.out.println("Создание файла...");
        TextFile textFile = new TextFile(name, data);
        DirectoryService.addFile(dir, textFile);
        System.out.println("Файл " + name + ".txt создан.");
    }

    @Override
    public void renameFile(File file, String newName) {
        file.setName(newName);
    }

    @Override
    public void printFile(File file) {
        System.out.println(((TextFile) file).getData());
    }

    @Override
    public <String> void addToFile(File file, String addedData) {
        ((TextFile) file).setData(((TextFile) file).getData() + " " + addedData);
    }

}
