package sk.me.patterns.behavioral.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        for (Iterator iterator = employeeRepository.getIterator();iterator.hasNext();) {
            String employee = (String) iterator.next();
            System.out.println(String.format("Employee: %s",employee));
        }

    }

}
