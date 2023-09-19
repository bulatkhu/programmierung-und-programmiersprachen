package de.rub.compiler;

public class Compiler {
    private Parser parser;
    private Assembler assembler;
    private Linker linker;

    public Compiler() {
        this.parser = new Parser();
        this.assembler = new Assembler();
        this.linker = new Linker();
    }

    public void compile(String sourceFile) {
        parser.parse(sourceFile);
        compileInternal(sourceFile);
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
        System.out.println("Done.");
    }

    private void compileInternal(String sourceFile) {
        System.out.println("Compiling " + sourceFile);
    }
}
