package eight.srteams;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;




public class StreamTest {

    public static void main(String args[]) {


        List<Employee> employeeList = new StreamTest().createEmployeeList();





/**
 * Sorting on employee age
 */
        System.out.println("***Sorting on employee age****"+employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()));


/**
 * Use of predicate
 */
        Predicate<Employee> nameCompare = x -> x.getName().equalsIgnoreCase("ramesh");
        System.out.println("Check if Ramesh is present-->>" + employeeList.stream().anyMatch(nameCompare));


/**
 * Get Maximum and minimum
 */
        Comparator<Employee> compareSalary = Comparator.comparing(Employee::getSalary);
        //using max and method reference
        System.out.println("Max salary by method reference--->>>" + employeeList.stream().max(compareSalary).get().getSalary());
        //using max and  core lambda expression
        System.out.println("Max salary by method reference--->>>" + employeeList.stream().max(Comparator.comparing(x -> x.getSalary())).get().getSalary());
        //Minimum salary
        System.out.println("min salary by method reference--->>>" + employeeList.stream().min(compareSalary).get().getSalary());
        //U can get max or min on primitive variable which dont need  comparator
        Integer minAge = employeeList.stream().mapToInt(Employee::getAge).max().getAsInt()  ;


//Get list of Emoployee of age 21 using filter
        List<Employee> employeesOfAge21 = employeeList.stream().filter(x -> x.getAge() == 21).collect(Collectors.toList());
        System.out.println("Employees having age 21--"+employeesOfAge21);

//Get list of string of names
        List<String> namesOfAge21= employeeList.stream().filter(x -> x.getAge() == 21).map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employee name having age 21--"+namesOfAge21);

        /**
         * Convert into Map using id as key
         */
        Map<Integer, Employee> employeeMap = employeeList.stream().collect(Collectors.toMap(e->e.getId(), e->e));
        System.out.println("Employee Map------------->>"+employeeMap);




    }


    public  List<Employee> createEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(21, "ramesh", 2000d ,1));
        employeeList.add(new Employee(22, "max", 3500d,2));
        employeeList.add(new Employee(23, "alex", 4800d,3));
        employeeList.add(new Employee(24, "ram", 5200d,4));
        employeeList.add(new Employee(21, "vishal", 4200d,5));
        return employeeList;

    }


}



