package codingBat.warmup1;

public class MissingChar {

   // Given a non-empty string and an int n,
    // return a new string where the char at index n has been removed.
    // The value of n will be a valid index of a char in the original string
    // (i.e. n will be in the range 0..str.length()-1 inclusive).


    public static String missingChar1(String str, int n) {
        return str.substring(0,n)+str.substring(n+1);

    }

    public static String missingChar2(String str, int n) {
        String newStr="";
        for (int i = 0; i <str.length() ; i++) {
            if (i != n) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    public static String missingChar3(String str, int n) {
        StringBuilder newStr= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (i != n) {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
    

    public static void main(String[] args) {
//        MissingChar mc = new MissingChar();
//        mc.missingChar("kitten",1);
        System.out.println(missingChar1("kitten",1));
        System.out.println(missingChar2("kitten",1));
        System.out.println(missingChar3("kitten",1));
    }
}
