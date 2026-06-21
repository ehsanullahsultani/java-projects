import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        int[] calculta_average = new int[6];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 6 numbers to calculate the average of them:");
        for ( int i = 0 ; i < calculta_average.length ; i++){
            System.out.print(i+1+":");
            calculta_average[i] = scn.nextInt();

        }
         int average_number = 0;
         for ( int z = 0 ; z < calculta_average.length ; z++){
          average_number = average_number + calculta_average[z] ;

        }
         double result = (double)( average_number) / (double)(calculta_average.length);
         System.out.println("The average of numbers that you typed is :" + result);
    }
}