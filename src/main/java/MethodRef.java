import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names =  Arrays.asList("Zeynep","Ayse","Mehmet","Ahmet");

        Consumer<List<String>> listPrinter = System.out::println;
        listPrinter.accept(names);
    }
}
