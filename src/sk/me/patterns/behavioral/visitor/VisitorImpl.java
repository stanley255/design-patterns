package sk.me.patterns.behavioral.visitor;

public class VisitorImpl implements Visitor {

    @Override
    public int visit(Pen pen) {
        int price = pen.getPrice();
        System.out.println(String.format("%s costs %d",pen.getModel(),price));
        return price;
    }

    @Override
    public int visit(Notebook notebook) {
        int price = notebook.getNumberOfPages() > 250 ? notebook.getPrice() - 5 : notebook.getPrice();
        System.out.println(String.format("Notebook costs %d",price));
        return price;
    }

}
