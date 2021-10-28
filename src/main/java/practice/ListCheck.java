package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCheck {
    public static void main(String[] args) {
        List<String > name= new ArrayList<>(Arrays.asList("Ram", "Mahesh"));
        name.remove("Ram");
        name.forEach(s -> System.out.println(s));
    }
}
