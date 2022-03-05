package eight.SupplierConsumer;

import eight.domain.Employee;

import java.util.Objects;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        Supplier<Employee> employeeSupplier= ()-> new Employee.Builder().withName("amit").build();
        Employee employee= enrichEmployeeWithAge(employeeSupplier);
        System.out.println(employee.getAge());

    }

    private static Employee enrichEmployeeWithAge(Supplier<? extends Employee> supplier) {
        Employee employee=supplier.get();

        employee.setAge(18);
        return employee;
    }

}
