package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        List<String> list = List.of("Siddiquer", "Rakibul", "Shariful", "Milton");

        // filter.......... (predicate -> {})..... return boolean value
        list.stream().filter(p -> (p.startsWith("S"))).forEach(s -> {
            System.out.print(s + ", ");
        });

        System.out.println("");

        // map(Function ) .............. operatio each element.............

        List<Integer> numbers = List.of(1,3,5,6,7,9);
        numbers.stream().map(integer -> integer * integer).forEach(r -> {
            System.out.println("Square Value are : " + r);
        });

    }


}
