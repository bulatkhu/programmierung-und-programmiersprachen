package übung8;

public class FacadeMuster {
    public static void main(String[] args) {
        Compiler compiler = new Compiler();

        compiler.compile("SourceFile");
    }
}

class Compiler {
    private Parser parser = new Parser();
    private Assembler assembler = new Assembler();
    private Linker linker = new Linker();

    public void compile(String sourceFile) {
        parser.parse(sourceFile);
        compileInternal(sourceFile);
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
    }

    private void compileInternal(String sourceFile) {
        System.out.println("Compile internal file: " + sourceFile);
    }
}

class Scanner {
    public void scan(String sourceFile) {
        System.out.println("Scanning file: " + sourceFile);
    }
}

class Parser {
    private final Scanner scanner = new Scanner();

    public void parse(String sourceFile) {
        System.out.println("Parsing file: " + sourceFile);
        scanner.scan(sourceFile);
    }
}

class Assembler {
    public void assemble(String sourceFile) {
        System.out.println("Assembling file: " + sourceFile);
    }
}

class Linker {
    public void link(String sourceFile) {
        System.out.println("Linking file: " + sourceFile + "");
    }
}