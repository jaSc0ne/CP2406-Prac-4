// Determines whether the item number on order is valid
// over 999 is invalid
// less than 111 is invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher - Housewares Department
import java.util.Scanner;
public class FixDebugFive3 {
    public static void main(String args[]){
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the item number: ");
        item = Integer.parseInt(input.next());
        if(item < 100)
            output = "Item number is too low.";
        else
            if(item > 999)
                output = "Item number is too high";
            else
                if(item < HIGH && item >= CUTOFF)
                    output = "Valid - Item is in Housewares Department.";
                else
                    output = "Valid - Item is in Automotive Department.";
        System.out.println(output);
    }

}
