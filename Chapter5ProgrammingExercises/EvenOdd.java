// Determines if a user-entered integer is even or odd
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        int num;
        String output;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        num = Integer.parseInt(input.next());
        if(num%2 == 0)
            output = "Integer is even.";
        else
            output = "Integer is odd.";
        System.out.println(output);
    }
}
