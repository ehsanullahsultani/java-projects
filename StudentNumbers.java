import java.util.Scanner;

public class StudentNumbers{
    public static void main(String[] args) {
        int studnet = 1;
        int result = 0;
        char[]  key = {'A' , 'D','C'};
        Scanner scn = new Scanner(System.in);
        char[][] answer = new char[2][3];
        for(int i = 0 ;i <answer.length;i++){
           
            System.out.println("-----Student: "+ studnet+"-----");
             System.out.println("1:A\t 2:B\t 3:C\t 4:D");
            for(int j = 0 ; j<answer[i].length; j++){
                answer[i][j] = scn.next().charAt(0);
            
               if(answer[i][j] ==key[j]){
                result= result +50;

               }
               
            }
            System.out.println("The result of student "+ studnet+ " is ="+ result);
               result =0;
            studnet++;
        }
    }
}