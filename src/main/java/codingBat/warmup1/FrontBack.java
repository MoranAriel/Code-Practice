package codingBat.warmup1;

public class FrontBack {

    //  Given a string, return a new string where the first and last chars have been exchanged.
    public static void main(String[] args) {
        String str = "moran";
        System.out.println(frontBack1(str));
        System.out.println(frontBack2(str));
    }

    public static String frontBack1(String str) {
        if (str.length()>1) {
            String newStr = str.substring(str.length() - 1);
            newStr += str.substring(1, str.length() - 1);
            newStr += str.substring(0, 1);
            return newStr;
        } else {
            return str;
        }
    }

    public static String frontBack2(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

}
