package basic_of_oop.Task_1.service;

import basic_of_oop.Task_1.entity.File;

public abstract class FileService{
        public abstract void renameFile(File file, String newName);
        public abstract void printFile(File file);
        public abstract <T> void addToFile(File file, T addedData);
}

