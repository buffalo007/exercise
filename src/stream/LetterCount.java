package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class LetterCount {


    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(name -> name.length())
                .sum();
        return 0;
    }

    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = Arrays.stream(names)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        return uppercaseNames;
    }
}
