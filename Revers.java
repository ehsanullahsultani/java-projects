import java.util.Scanner;

public class Revers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of array's elements:");
        int num = scn.nextInt();
        int[] make_reverse = new int[num];
        System.out.println("Enter the numbers:");
        for (int i =0 ; i < make_reverse.length ; i++){
            make_reverse[i] = scn.nextInt();
        }
      
        int make = make_reverse.length -1;
        for(int i = 0 ; i <make_reverse.length/2;i++){
            
            int temp = make_reverse[i];
            make_reverse[i] = make_reverse[make];
            make_reverse[make] = temp;
            make--;
         
        }
        System.out.println("--------------------------------");
        for( int show : make_reverse){
            
            System.out.println(+show);
        }

    }
}