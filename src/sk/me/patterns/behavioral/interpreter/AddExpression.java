package sk.me.patterns.behavioral.interpreter;

public class AddExpression implements Expression {

    private String expression;

    public AddExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine engine) {
        return engine.add(expression);
    }

}
