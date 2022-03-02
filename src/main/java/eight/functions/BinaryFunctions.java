package eight.functions;

import eight.domain.Employee;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BinaryFunctions {
    static BiFunction<Integer ,String , Employee> createAnEmployee= (age , name)-> new Employee(age,name,age.doubleValue()+1 , (int) (age*Math.random()));
    static Function<Employee, Employee> addMrToEmpName= (employee -> {employee.setName("Mr "+employee.getName()); return employee;});



    public static void main(String[] args) {
        Employee employee= createAnEmployee.apply(32,"narendra");
        System.out.println( "normal creation "+employee);
        Employee alteredEmployee=createAnEmployee.andThen(addMrToEmpName).apply(33, "Rahul");
        System.out.println("Altered emp after creation ==="+ alteredEmployee);

    }
}
