package eight.GenericInterface;

import eight.domain.Employee;
import eight.domain.Person;

public class PersonToEmployeeTranslator implements DomainTranslator {
    @Override
    public Employee translate(Person person) {
        Employee employee = new Employee();
        employee.setAge(person.getAge());
        employee.setName(person.getName());
        return employee;
    }
}
