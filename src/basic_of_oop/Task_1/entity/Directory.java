package basic_of_oop.Task_1.entity;

import java.util.ArrayList;

public class Directory {
    private String path;
    private ArrayList<File> files = new ArrayList<>();

    public Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
}
