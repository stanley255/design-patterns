package sk.me.patterns.structural.filter;

import java.util.List;

public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}