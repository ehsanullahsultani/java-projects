import java.util.Scanner;

public class Declare_Arry {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scn = new Scanner(System.in);
        int z = 5 ;
        for (int i = 0 ; i < numbers.length ; i++){
            
            System.out.print("Write "+z+" number:");
            numbers[i] = scn.nextInt();
            z--;
        

        }
        for(int a = 0 ; a < numbers.length ; a++){
            System.out.println(a+1 + ": " + numbers[a]);
        }
    }
}
