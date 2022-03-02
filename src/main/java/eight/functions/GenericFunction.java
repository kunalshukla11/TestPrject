package eight.functions;

import eight.domain.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericFunction {
   public  static   <T> List<T> createListFromArray(T[] array ){
       return Arrays.stream(array).collect(Collectors.toList());

   }
   public static void  main(String[] args){
       Employee[] employees = {new Employee(25,"Rahul",25d, 1), new Employee(26,"Simran", 65d,2)};
       List<Employee> employees1= createListFromArray(employees);
       System.out.println(employees1);

   }




}
