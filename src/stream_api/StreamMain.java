package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        // create a list and print even number

        List<Integer> list1 = List.of(1, 4, 5, 7, 8, 7, 9);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(2);
        list2.add(3);
        list2.add(23);
        list2.add(4);
        list2.add(5);

        List<Integer> list3 = Arrays.asList(20,22,11,21,12,1,5,14);

        /// list1
        /// print without strem
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for(Integer i : list1){
            if(i%2 == 0){
                evenList.add(i);
            }
            if(i%2 != 0){
                oddList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);
        System.out.println("");

        // using stream api
        List<Integer> collect = list1.stream().filter(r -> r % 2 == 0).collect(Collectors.toList());
        List<Integer> collect1 = list1.stream().filter(r -> r % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);

    }
}
