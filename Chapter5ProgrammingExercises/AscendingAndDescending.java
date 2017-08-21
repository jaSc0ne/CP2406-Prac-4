// Asks the user to enter three integers and displays them in ascending and descending order
import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String args[]) {
        int num1, num2, num3;
        int low, med, high;
        String output1, output2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = Integer.parseInt(input.next());

        System.out.println("Enter an integer: ");
        num2 = Integer.parseInt(input.next());

        System.out.println("Enter an integer: ");
        num3 = Integer.parseInt(input.next());

        if (num1 <= num2 && num1 <= num3) {
            low = num1;
            if (num2 <= num3) {
                med = num2;
                high = num3;
            } else {
                med = num3;
                high = num2;
            }
        } else {
            if (num2 <= num1 && num2 <= num3) {
                low = num2;
                if (num1 <= num3) {
                    med = num1;
                    high = num3;
                } else {
                    med = num3;
                    high = num1;
                }
            } else {
                low = num3;
                if (num1 <= num2) {
                    med = num1;
                    high = num2;
                } else {
                    med = num2;
                    high = num1;
                }
            }
        }
        System.out.println("Ascending order: "+low+", "+med+", "+high);
        System.out.println("Descending order: "+high+", "+med+", "+low);
    }
}
