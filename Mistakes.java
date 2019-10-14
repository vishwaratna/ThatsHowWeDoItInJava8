import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mistakes {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"ram");
        map.put(3,"ram");
        map.put(4,"gopal");
        map.put(5,"madan");
        map.put(6,"shyam");
        map.put(7,"gopal");
        map.put(8,"ram");

        Map<String,Long> valueCount = map.values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Integer> collect = map.entrySet()
                .stream()
                .filter(entry -> valueCount.get(entry.getValue()) == 1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

collect.forEach(System.out::println);

    }
}


