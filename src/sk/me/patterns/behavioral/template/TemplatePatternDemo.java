package sk.me.patterns.behavioral.template;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Employee employee = new Programmer();
        employee.comeToWork();

        System.out.println();

        employee = new Manager();
        employee.comeToWork();
    }

}
