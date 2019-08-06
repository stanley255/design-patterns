package sk.me.patterns.behavioral.interpreter;

public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter(new InterpreterEngine());

        System.out.println("Result: " + interpreter.interpret("add 15 and 25"));
        System.out.println("Result: " + interpreter.interpret("multiply " + interpreter.interpret("add 5 and 5") + " and 10"));
    }

}
