package stringbuilder;

import java.util.*;
import java.util.stream.Collectors;

public class StringBuilderExample {

    public static StringMethod method = new StringMethod("successes");

    public static void main(String[] args) {

    String originalString = "successes";
    String one = "asdss";
    String two = "asdss";
        System.out.println(originalString.replaceAll("w", ""));
    StringBuilder tree = new StringBuilder("asdssgfg");
    int positionOfCharacter = 1;
    int indexStart = 1;
    int indexEnd = 4;
    char[] charArray = {'a','b','1','2','k'};
    String lookingFor = "com";
    getCharacterAtPosition(originalString, positionOfCharacter);
    getUniCodeAtPosition(originalString, positionOfCharacter);
    getUniCodeBeforePostion(originalString, positionOfCharacter);
    countNumberOfUniCodePointsOfTextRage(originalString, indexStart, indexEnd);
    compareTwoStringLexicographically(one, two, tree);
    createNewStringwihtContentOfCharArray(charArray);
    checkWhetherStringEndWithAnoterStrin(originalString, lookingFor);
    getContentOfStringAsByteArray(originalString);
    getContentOfStringAsCharacterArray(originalString);
    createUniqueIdentifierOfString(originalString);
    checkWhetherStringStartsWithAnotherString("Red is favorite color.");
    convertAllCharactersToLowerCase(originalString);
    trimLeadingOrTrailingWhiteSpace(originalString);
    mostFrequentCharacter(originalString);
    secondMostFrequestCharacter();

    Character mostFrequentCharacter = method.mostFrequentCharacter(originalString);
        System.out.println(mostFrequentCharacter);
    String newString = originalString.replaceAll(mostFrequentCharacter.toString(), "");
    Character secondMostFrequeChar = method.mostFrequentCharacter(newString);
        System.out.println(secondMostFrequeChar);



    }

    private static void secondMostFrequestCharacter() {
    }

    private static void mostFrequentCharacter(String originalString) {
       Map<Character, Long> characterOccurance =          originalString.chars()
                        .mapToObj (x -> (char) x)
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

       Character key = Collections.max(characterOccurance.entrySet(), Comparator.comparingLong(Map.Entry::getValue)).getKey();
       Character key2 = Collections.max(characterOccurance.entrySet(), Map.Entry.comparingByValue()).getKey();
       
       
        System.out.println(key);
        System.out.println(key2);
        System.out.println(characterOccurance);





    }

    private static void trimLeadingOrTrailingWhiteSpace(String originalString) {
        System.out.println(originalString.trim());
    }

    private static void convertAllCharactersToLowerCase(String originalString) {
        System.out.println(originalString.toLowerCase());
    }

    private static void checkWhetherStringStartsWithAnotherString(String originalString) {
        System.out.println(originalString.startsWith("Red"));
        System.out.println(originalString.startsWith("Orange"));
    }

    private static void createUniqueIdentifierOfString(String originalString) {
        System.out.println(originalString.hashCode());
    }

    private static void getContentOfStringAsCharacterArray(String originalString) {
        char[] charArray = originalString.toCharArray();
        String newString = new String(charArray);

        System.out.println(Arrays.toString(charArray));
        System.out.println(newString);
    }

    private static void getContentOfStringAsByteArray(String originalString) {
        byte[] byteArray = originalString.getBytes();
        String newString = new String(byteArray);
        System.out.println(Arrays.toString(byteArray));
        System.out.println(newString);
    }

    private static void checkWhetherStringEndWithAnoterStrin(String originalString, String lookingFor) {
        System.out.println(originalString.endsWith(lookingFor));
    }

    private static void createNewStringwihtContentOfCharArray(char[] charArray) {
        String string = String.copyValueOf(charArray);
        System.out.println(string);
    }

    private static void compareTwoStringLexicographically(String one, String two, StringBuilder tree) {
        System.out.println(one.equalsIgnoreCase(two));
        System.out.println(one.contentEquals(two));
        System.out.println(one.contentEquals(tree));
        System.out.println(one.equals(tree.toString()));


    }

    private static void countNumberOfUniCodePointsOfTextRage(String originalString, int indexStart, int indexEnd) {
        System.out.println(originalString.codePointCount(indexStart, indexEnd));

    }

    private static void getUniCodeBeforePostion(String originalString, int positionOfCharacter) {
        System.out.println(originalString.codePointBefore(positionOfCharacter));
    }

    private static void getUniCodeAtPosition(String originalString, int positionOfCharacter) {
        System.out.println(originalString.codePointAt(positionOfCharacter));
    }

    private static void getCharacterAtPosition(String originalString, int positionOfCharacter) {
        System.out.println(originalString.charAt(positionOfCharacter));

    }
}
