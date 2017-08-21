// calculates the factorial for every integer from 1 to 10
public class Factorials {
    public static void main(String args[]){
        int result = 1, count;
        String output;
        for(count = 2; count <=11; count++){
            result = result*(count-1);
            output = (count-1)+" factorial is "+result;
            System.out.println(output);

        }


    }
}
