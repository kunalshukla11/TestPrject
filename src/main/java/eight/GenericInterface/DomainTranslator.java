package eight.GenericInterface;

import eight.domain.Employee;
import eight.domain.Person;

public interface DomainTranslator extends Translator<Person, Employee>{

    @Override
    Employee translate(Person d);
}
