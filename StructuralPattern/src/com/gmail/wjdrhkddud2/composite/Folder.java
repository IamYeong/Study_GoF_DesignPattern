package com.gmail.wjdrhkddud2.composite;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Folder implements Directory {

    private String name;
    private List<Directory> files;

    public Folder(String folderName) {
        this.files = new ArrayList<>();
        this.name = folderName;
    }

    public void add(Directory directory) {
        this.files.add(directory);
    }

    @Override
    public int size() {
        int totalSize = 0;

        for (int i = 0; i < files.size(); i++) {
            Directory directory = files.get(i);
            totalSize += directory.size();

        }

        return totalSize;
    }

    @Override
    public void remove() {
        for (int i = 0; i < files.size(); i++) {
            files.get(i).remove();
        }
        files.clear();
    }
}
