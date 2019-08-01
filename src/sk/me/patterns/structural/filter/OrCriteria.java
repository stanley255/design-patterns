package sk.me.patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> criteriaFilteredPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaFilteredPersons = otherCriteria.meetCriteria(persons);
        return criteriaFilteredPersons.stream().filter(otherCriteriaFilteredPersons::contains).collect(Collectors.toList());
    }
}
