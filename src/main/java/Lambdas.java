import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> numbers =  Arrays.asList(1,2,3,4,5);


        numbers.stream()
                .map(x -> x * 2)
                .forEach(x -> System.out.println(x));




    }
}
