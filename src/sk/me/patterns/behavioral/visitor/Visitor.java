package sk.me.patterns.behavioral.visitor;

public interface Visitor {

    int visit(Pen pen);
    int visit(Notebook notebook);

}
