import javax.swing.*;
import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int res = x;
        if(x==0) return 1;
        for(int i = 1; i<x; i++) {
            res = res*i;
        }
        return res;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    /*
    E == 1/x!+1/x+1!...
     */

    public static double calculateE() {
        int i=0;
        double res = 0;
        while(i<20) {
            res += 1/factorial(i);
            i++;
        }
        return res;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static String babylonian(double x) {
        String res = "";
        double posX = Math.abs(x);
        double guess = posX;
        double nextGuess;
        double diff = Double.MAX_VALUE;
        double lastGuess;

        while(Math.abs(diff)>0.00001) {
            lastGuess = guess;
            nextGuess = (guess + posX/guess)/2;
            guess = nextGuess;
            diff = nextGuess-lastGuess;

        }
        if(x>=0) {
            return res + guess;
        } else {
            return res + guess + "i";
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("give a number");
        double in = scan.nextDouble();
        System.out.println("The square root of " + in + " is approximately " + babylonian(in) +".");
        System.out.println("The value of e is approximately " + calculateE() + ".");


        

        scan.close();
    }
}
