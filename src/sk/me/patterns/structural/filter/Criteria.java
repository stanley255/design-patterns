package sk.me.patterns.structural.filter;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
