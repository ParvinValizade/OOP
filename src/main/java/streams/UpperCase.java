package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


public class UpperCase {

    public static void main(String[] args) {
        System.out.println(mapToUpperCase("a", "S", "t", "n"));
    }

    public static Collection<String> mapToUpperCase(String... names) {
        return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
    }
}
