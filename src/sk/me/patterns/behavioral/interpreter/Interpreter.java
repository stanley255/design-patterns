package sk.me.patterns.behavioral.interpreter;

import java.util.Objects;

public class Interpreter {

    private InterpreterEngine engine;

    public Interpreter(InterpreterEngine engine) {
        this.engine = Objects.requireNonNull(engine, "Engine cannot be null");
    }

    public int interpret(String input) {
        Expression expression = null;

        if (input.contains("add")) {
            expression = new AddExpression(input);
        } else if (input.contains("multiply")) {
            expression = new MultiplyExpression(input);
        }

        int result = expression.interpret(engine);
        System.out.println(input);
        return result;
    }

}
