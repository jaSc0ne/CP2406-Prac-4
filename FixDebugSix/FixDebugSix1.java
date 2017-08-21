// You start with a penny. Double it every day. How much do you have in a 30 day month?
public class FixDebugSix1 {
    public static void main(String args[]){
        final int DAYS = 30;
        double money = 0.01; // represents one penny
        int day = 1; // Day 1
        while (day < DAYS){
            money = money*2;
            System.out.println("After day "+day+", you have $"+ money);
            day = day+1;
        }
    }
}
