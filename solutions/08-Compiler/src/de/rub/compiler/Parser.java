package de.rub.compiler;

class Parser {

    private Scanner scanner = new Scanner();
    public void parse(String sourceFile) {
        scanner.scan(sourceFile);
        System.out.println("Parsing " + sourceFile);
    }
}
