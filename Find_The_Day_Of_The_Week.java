import java.util.Scanner;

public class Find_The_Day_Of_The_Week {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int today = 0;
       String[] weekday = {"0: Saturday","1: Sunday", "2: Monday","3: tuesday","4: Wednsday","5: Tursday","6: Friday"};
       for( String i: weekday){
        System.out.println(i);
       }
       System.out.println("What day is today?(Enter the number of the day)");
       today = input.nextInt();
       System.out.println("How may day later you want?");
       int day = input.nextInt();
       
       int week =( today+day)% 7;
       System.out.println("If today is "+ weekday[today] + " then "+ day +" days later it will be "+ weekday[week]);
    }
}
