package com.gmail.wjdrhkddud2.composite;

public class File implements Directory {

    private String name;
    private int fileSize;

    public File(String fileName, int fileSize) {
        this.name = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public int size() {
        return fileSize;
    }

    @Override
    public void remove() {
        System.out.println("removed " + name);
    }
}
