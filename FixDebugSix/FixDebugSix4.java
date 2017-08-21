// Displays 5 random numbers between (and including) user-specified values
import java.util.Scanner;
public class FixDebugSix4 {
    public static void main(String args[]){
        int high, low, count = 0;
        final int NUM = 5;
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the high and low values
        System.out.print("This application displays "+NUM+
        "random numbers"+"\nbetween the low and high values you enter"+
        "\nEnter low value now: ");
        low = Integer.parseInt(input.next());
        System.out.print("Enter high value: ");
        high = Integer.parseInt(input.next());
        while(low > high){
            System.out.println("The number you entered for a high number, "+ high+
            ", is not more than "+low);
            System.out.print("Enter a number higher than "+low+": ");
            high = Integer.parseInt(input.next());
        }
        while(count < NUM){
            double result = Math.random(); // random() returns a value between 0 and 1
            int answer = (int)(result*10+low);
            // multiply by 10 and add low -- random is at least the value of low
            // only user answer if it is low enough
            if(answer <= high){
                System.out.print(answer+" ");
                count++;
            }
        }
        System.out.println();
    }


}
