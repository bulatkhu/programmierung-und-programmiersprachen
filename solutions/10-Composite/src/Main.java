public class Main {
    public static void main(String[] args) {
        FileSystemComponet file1 = new File("uebung_10", 34);
        FileSystemComponet file2 = new File("loesung_10", 50);
        Directory directory1 = new Directory("uebungen");
        directory1.add(file1);
        directory1.add(file2);

        Directory directory2 = new Directory("ProPro");
        directory2.add(directory1);
        FileSystemComponet file3 = new File("Zusammenfassung", 387);
        directory2.add(file3);

        directory1.print();
        System.out.println(directory1.getSize());

        directory2.print();
        System.out.println(directory2.getSize());

        file3.print();
        System.out.println(file3.getSize());
    }
}