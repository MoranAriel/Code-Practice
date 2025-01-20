package codingBat.warmup1;

public class StartHi {

    // Given a string,
    // return true if the string starts with "hi"
    // and false otherwise.


    //startHi("hi there") → true
    //startHi("hi") → true
    //startHi("hello hi") → false

    public static boolean startHi1(String str) {
        String start = str.substring(0, 2);
        return start.equalsIgnoreCase("hi");
     // return start.equalsIgnoreCase("hi") ? true : false;
    }

    public static boolean startHi2(String str) {
        if (str.length() < 2) {
            return false;
        }
        String start = str.substring(0, 2);
        return ((start.equalsIgnoreCase("hi")) ? true : false);
    }

    public static void main(String[] args) {
        System.out.println(startHi1("hi Hello"));
        System.out.println(startHi1("Hi Hello"));
        System.out.println(startHi1("Hello hi"));
        System.out.println();
        System.out.println(startHi2("hi Hello"));
        System.out.println(startHi2("Hi Hello"));
        System.out.println(startHi2("Hello hi"));
    }

}
