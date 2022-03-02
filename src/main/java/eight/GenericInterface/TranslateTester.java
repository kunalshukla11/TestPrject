package eight.GenericInterface;

import eight.domain.Employee;
import eight.domain.Person;

public class TranslateTester {

    public static void main(String[] args) {
       NameTranslator nameTranslator = new NameTranslator();
        System.out.println(nameTranslator.translate("Narendra"));

        PersonToEmployeeTranslator personToEmployeeTranslator= new PersonToEmployeeTranslator();
        Person person = new Person();
        person.setName("kunal");
        person.setAge(12);
        Employee employee= personToEmployeeTranslator.translate(person);
        System.out.println("got emp with name " +employee.getName());


    }
}
