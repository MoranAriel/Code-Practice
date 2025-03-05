package codingBat.warmup1;

public class In1020 {

//    Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    public static void main(String[] args) {

        System.out.println(in1020b(13, 5));
    }

    public static boolean in1020a(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean in1020b(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);


    }

}
