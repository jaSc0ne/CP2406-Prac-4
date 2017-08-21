// Ask the user for an even number or the sentinel value 999.
// If the number is even, display "Good Job" and then ask for another input
// If the number is odd, display an error message and ask for another input
// If the number is 999, end the program
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
public class EvenEntryLoop {
    public static void main(String args[]){
        int even;
        int userNumber;
        String getUserNumber;
        getUserNumber = JOptionPane.showInputDialog(null, "Enter an even number: ");
        userNumber = Integer.parseInt(getUserNumber);
        while(userNumber != 999){
            if(userNumber%2 != 0) {
                getUserNumber = JOptionPane.showInputDialog(null, "Number is not even - try again: ");
                userNumber = Integer.parseInt(getUserNumber);
            }else{
                getUserNumber = JOptionPane.showInputDialog(null, "Good job! Enter another number: ");
                userNumber = Integer.parseInt(getUserNumber);
            }
        }

    }
}
