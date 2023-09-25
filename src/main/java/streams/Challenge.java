package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {

    public static void main(String[] args) {
        System.out.println(getString(Arrays.asList(3,44)));
        System.out.println(getString(List.of(5)));
    }

    public static String getString(List<Integer> list) {
        return list.stream()
                .map(i -> {
                    String s = "";
                    if (i % 2 == 0) {
                        s += "e" + i;
                    } else {
                        s += "o" + i;
                    }
                    return s;
                })
                .collect(Collectors.joining(","));
    }
}
