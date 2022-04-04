package stringbuilder;

public class Main {

    public static void main(String[] args) {

        StringMethod stringMethod = new StringMethod("           The Quick BroWn FoX!  ");

        String trimmedString = stringMethod.trimLeadingOrTrailingWhiteSpace();
        System.out.println(trimmedString);
    }
}


//  Done:       1 - 31
//  Skipped:    32, 33,35,