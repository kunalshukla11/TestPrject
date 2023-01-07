package eight.SupplierConsumer;

import eight.domain.Employee;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        Supplier<Employee> employeeSupplier= ()-> new Employee.Builder().withName("amit").build();
        //creating Consumer
        Consumer<Employee> employeeConsumer = (employee)-> {employee.setAge(181);
            System.out.println("Printing emp with Consumer  "+employee);};
        //conusmer accepting emp via supplier.get
        employeeConsumer.accept(employeeSupplier.get());

        //using Supplier as parameter
        Employee employee= enrichEmployeeWithAge(employeeSupplier);
        System.out.println(employee.getAge());

    }

    private static Employee enrichEmployeeWithAge(Supplier<? extends Employee> supplier) {
        Employee employee=supplier.get();

        employee.setAge(18);
        return employee;
    }

}
