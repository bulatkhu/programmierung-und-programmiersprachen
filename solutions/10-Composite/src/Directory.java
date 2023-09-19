import java.util.ArrayList;

public class Directory implements FileSystemComponet{
    private String name;
    private ArrayList<FileSystemComponet> Inhalt = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name + ": ");
        for (FileSystemComponet componet : Inhalt){
            componet.print();
        }
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponet componet : Inhalt){
            size += componet.getSize();
        }
        return size;
    }

    public void add(FileSystemComponet componet){
        Inhalt.add(componet);
    }

    public void remove(FileSystemComponet componet){
        Inhalt.remove(componet);
    }
}
