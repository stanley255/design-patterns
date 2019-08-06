package sk.me.patterns.behavioral.iterator;

public class EmployeeRepository implements Sector {

    public String[] employees = {"David", "Scott", "Rhett", "Andrew", "Jessica"};

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < employees.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? employees[index++] : null;
        }
    }

}
