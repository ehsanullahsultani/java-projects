import java.util.Scanner;

public class Array_execute{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of array list");
        int x = scn.nextInt();
        int sum = 0;
        int max = 0;
        int[] numbers = new int[x];
        for(int i = 0 ; i <numbers.length ; i ++){
            numbers[i] = (int)(Math.random() * 100);

        }
        System.out.println("The array number are: ");
        for (int y : numbers){
            System.out.print(y+" ,");
            sum += y;
        }
        double avarage = sum / numbers.length;
        System.out.println("The whole sum of array is :" +sum);
        System.out.println("The avarage of array is " + avarage);
        for(int i = 0; i< numbers.length;i++){
          if (avarage < numbers[i]){
            max++;
          }
        }
        System.out.println("Numbers of elements above the avarage :" + max);
    }
}