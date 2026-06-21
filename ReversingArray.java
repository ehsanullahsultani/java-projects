import java.lang.System;
public class ReversingArray{
    public static void main(String[] args){
    int[] numbers = {1,2,3,4,5,6,7,8};
    System.out.println("Before reversing");
    for(int show: numbers){
        System.out.print(show+"  ");
    }
    System.out.println();
    System.out.println("After reversing");
    for(int show:  reverse(numbers)){
        System.out.print(show+"  ");
    }
}

   
        public static int[] reverse(int[] list) {
 int[] result = new int[list.length];

 for (int i = 0, j = result.length - 1;
 i < list.length; i++, j--) {
 result[j] = list[i];
 }

 return result;
    }
}