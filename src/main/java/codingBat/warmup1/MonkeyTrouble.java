package codingBatSolutions.warmup_1;

//We have two monkeys, a and b,
// and the parameters aSmile and bSmile indicate
// if each is smiling.
// We are in trouble if they are both smiling or
// if neither of them is smiling. Return true if we are in trouble.
//
//
//        monkeyTrouble(true, true) → true
//        monkeyTrouble(false, false) → true
//        monkeyTrouble(true, false) → false


public class MonkeyTrouble {


    public static void main(String[] args) {
        boolean a;
        boolean b;
        int aa = (int) (Math.random() * 2);
        int bb = (int) (Math.random() * 2);
        if (aa < 1) {
            a = true;
        } else
            a = false;

        if (bb < 1)
            b = true;
        else b = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(monkeyTrouble(a, b));
    }
//
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile==bSmile){
            return true;
        }
        return false;
    }
    }



