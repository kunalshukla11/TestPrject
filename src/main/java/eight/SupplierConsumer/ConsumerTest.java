package eight.SupplierConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("aem" ,"skd", "djljd");

        Consumer<String> stringConsumer= x-> System.out.println("hey--"+x);
        name.stream().forEach(stringConsumer);

    }


}
