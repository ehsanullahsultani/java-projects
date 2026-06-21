import java.util.Scanner;

public class TryBinary{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[1000];
        System.out.println("Which number you want to search:");
        int target = scn.nextInt();
        scn.close();
        for(int i = 0 ; i <numbers.length; i++){
            numbers[i] = i;
            
        }
        binarysearch(numbers, target);

        
    }
 public static void binarysearch(int[] array, int target){
    int high = array.length -1;
    int low = 0;
    int search = 0;
    int middle = 0;
    while( low < high){
         middle = low+ (high - low)/2;
       
        if ( array[middle] < target) low = middle+1;
        if( array[middle] > target) high = middle -1;
         if ( array[middle] == target) {
            System.out.println("The target "+ target +" founded in index "+ middle);
            low = high;
        }
        
        search++;
    }
    if(middle != target) System.out.println("Target not found!");
    System.out.println("We searched "+ search + " times the target.");
 }

}