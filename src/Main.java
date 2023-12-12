import java.math.BigInteger;//class va method in BigInteger ro vared mikone
import java.util.*;

public class Main {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        //salam khedmat shoma ostad ahmadi
        //factorial 50 az class haye java estefade shode math va BigInteger dar khat 1

        //dddddddddddd
        //it is ddd235
        /*********************/
        //it is for ddd237

        //migitr add ro
        long n;// ba long chon milioni ham anjam mede
        BigInteger fact = BigInteger.ONE;//in ye class ke bishtar az long anjam mide
        for(;;) {
            System.out.println("please enter your number (you can use very big number)");
            n = in.nextLong();
            if ((n == 0) || (n == 1)) {//age 0 ya 1 bashe malome 1 anjam nemide
                System.out.println("Factorial is 1");//mige 1
            } else {//ya joor dige
                fact = BigInteger.valueOf(n);//hala chon az class BigInteger estefade kardim BAYAD
                //BA METHOD add n ro bargardonim methode valueOf()

                while (n > 1) {
                    fact = fact.multiply(BigInteger.valueOf(n - 1));//fact dovom class hast va multiply(); methid class
                    // zarb mikone
                    n--;
                }
                System.out.println("Factorial of " + n + " is " + fact);
            }
        }
    }
}