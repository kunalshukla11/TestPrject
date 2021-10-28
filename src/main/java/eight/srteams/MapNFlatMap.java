package eight.srteams;






import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapNFlatMap {
    public static void main(String args[]) {
        List<List<String>> listList = Arrays.asList(Arrays.asList("a", "b", "C"), Arrays.asList("d", "d", "e"));
        listList.stream().forEach((System.out::println));

        listList.stream().flatMap(x -> x.stream()).forEach(System.out::println);
        System.out.println(listList.stream().flatMap(x -> x.stream()).reduce("", (a, b) -> a + b));

        List<List<Employee>> listList1 = Arrays.asList(Arrays.asList(new Employee(21, "ramesh", 2000d, 11), new Employee(21, "jain", 2000d,12 )),
                                        Arrays.asList(new Employee(21, "jain", 2000d,2 )));
        List<String> listNames= listList1.stream().flatMap(employeesLsit -> employeesLsit.stream()).map(Employee::getName).collect(Collectors.toList());
        System.out.println(listNames);
        int k= 5;

        IntStream.range(1,++k).forEach(value -> System.out.println(String.join("", Collections.nCopies(value, "*"))));


    }










}
