package codingBat.warmup1;

public class FrontBack {

    //  Given a string, return a new string where the first and last chars have been exchanged.
    public static void main(String[] args) {
        String str = "";
        System.out.println(frontBack(str));
    }

    public static String frontBack(String str) {
        if (str.length()>1) {
            String newStr = str.substring(str.length() - 1);
            newStr += str.substring(1, str.length() - 1);
            newStr += str.substring(0, 1);
            return newStr;
        } else {
            return str;
        }
    }

}
