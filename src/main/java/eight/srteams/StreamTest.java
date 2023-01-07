package eight.srteams;



import eight.domain.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;




public class StreamTest {

    public static void main(String args[]) {


        List<Employee> employeeList = createEmployeeList();
        String[] duplicateNames = createStringArray();





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

        /**
         * Convert into Map using Collectors.groupingBy
         */
        Map<Object, List<Employee>> employeeAgeMap = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getAge()));
        System.out.println("Employee  Age Map------------->>"+employeeAgeMap);

        /**
         * Get total age of all employee by sum
         */
         Integer age = employeeList.stream().mapToInt(x-> x.getAge()).sum();
        System.out.println("Age sum using sum-->" +age);

        /**
         * Get total age of all employee reduce
         */
        Integer ageSumByReduce = employeeList.stream().map(employee -> employee.getAge()).reduce(0,(a, b)-> a+b);
        System.out.println("Age sum using reduce -->" +ageSumByReduce);

        ///////////////////////////////ArrayOperations/////////////////////////
        /**
         * Using Collectors.joining
         */
        String nameWithHyphens = Arrays.stream(duplicateNames).collect(Collectors.joining("--"));
        System.out.println("Name with Hyphnes--"+ nameWithHyphens);



        /**
         * Convert into Map<String,Long> use grouping by to create map
         * Get count of names which are duplicate
         */

        Map<String ,Long> nameMap= Arrays.stream(duplicateNames).filter(x-> Collections.frequency(Arrays.asList(duplicateNames), x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Name map with duplicate count------>" +nameMap);




    }


    public static List<Employee> createEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(21, "ramesh", 2000d ,1));
        employeeList.add(new Employee(22, "max", 3500d,2));
        employeeList.add(new Employee(23, "alex", 4800d,3));
        employeeList.add(new Employee(24, "ram", 5200d,4));
        employeeList.add(new Employee(21, "vishal", 4200d,5));
        return employeeList;

    }
     public static String[] createStringArray(){
         String [] duplicateName = {"ram", "ram", "mohon","mohon","mohon","rahul"};
         return duplicateName;
     }


}



