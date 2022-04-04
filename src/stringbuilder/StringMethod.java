package stringbuilder;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StringMethod {

    String originalString;


    public StringMethod(String originalString) {
        this.originalString = originalString;
    }

    public String trimLeadingOrTrailingWhiteSpace(){
       return originalString.trim();
    }

    public void print(){
        System.out.println(originalString);
    }

    public Character mostFrequentCharacter(String originalString){
        Map<Character, Long> characterOccurance =          originalString.chars()
                .mapToObj (x -> (char) x)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Character key = Collections.max(characterOccurance.entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();
        return key;
    }


}


