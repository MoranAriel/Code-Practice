package codingBat.warmup1;

public class BackAround {


    //Given a string, take the last char
    // and return a new string with the last char
    // added at the front and back, so "cat" yields "tcatt".
    // The original string will be length 1 or more.

    //backAround("cat") → "tcatt"
    //backAround("Hello") → "oHelloo"
    //backAround("a") → "aaa"


    public static String backAround1(String str) {
        return str.substring(str.length()-1) + str + str.substring(str.length()-1);
    }

    public static String backAround2(String str) {
        String last = str.substring(str.length()-1);
        return last + str + last;
    }


    public static void main(String[] args) {
        System.out.println(backAround1("cat"));
        System.out.println(backAround2("cat"));
    }

}
