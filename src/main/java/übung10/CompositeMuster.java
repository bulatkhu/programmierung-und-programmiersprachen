package übung10;

import java.util.ArrayList;

public class CompositeMuster {
    public static void main(String[] args) {
        Directory dir1 = new Directory("Dir 1");

        File file1 = new File("file1", 10);
        File file2 = new File("file2", 12);
        File file3 = new File("file3", 14);

        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);

        dir1.print();
    }
}

interface FileSystemComponent {
    public void print();
    public int getSize();
}

class Directory implements FileSystemComponent {
    private String name;
    private ArrayList<FileSystemComponent> fileSystemComponents;

    public Directory(String name) {
        this.name = name;
        this.fileSystemComponents = new ArrayList<>();
    }

    public void print() {
        System.out.println("Directory: " + name + " | " + getSize() + "mb");
        for (FileSystemComponent fileSystem: fileSystemComponents) {
            fileSystem.print();
        }
    }

    public int getSize() {
        int size = 0;

        for (FileSystemComponent fileSystem: fileSystemComponents) {
            size += fileSystem.getSize();
        }
        
        return size;
    }

    public void add(FileSystemComponent fileSystem) {
        fileSystemComponents.add(fileSystem);
    }

    public void remove(FileSystemComponent fileSystem) {
        fileSystemComponents.remove(fileSystem);
    }
}

class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.printf("    File: %s | %smb%n", name, size);
    }

    @Override
    public int getSize() {
        return size;
    }
}