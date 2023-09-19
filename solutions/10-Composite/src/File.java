public class File implements FileSystemComponet{

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public int getSize() {
        return size;
    }
}
