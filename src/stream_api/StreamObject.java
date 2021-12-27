package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // empty stream
        Stream<Object> empty = Stream.empty();

        String[] names = {"Siddiquer", "Rakibul", "Rifat", "Sufian"};


        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(r -> {
            System.out.print(r + " ");
        });
        System.out.println("");
        // way2
        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(2);
        list2.add(3);
        list2.add(23);
        list2.add(4);
        list2.add(5);

        list2.stream().forEach(r ->{
            System.out.print(r + ",");
        });
    }
}
