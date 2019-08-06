package sk.me.patterns.behavioral.visitor;

public interface Item {

    public int accept(Visitor visitor);

}
