import java.util.Scanner;



public class StudentMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System .in);
        System.out.print("How many subject did you stadied is this semister:");
        int subject_length = scn.nextInt();
        String[] subject = new String[subject_length];
         int[] subject_score = new int[subject_length];
         int[] credith = new int[subject_length];
         for (int i = 0 ; i < subject_length ; i++){
        System.out.print("Enter the subject name:");
        subject[i] = scn.next();
        System.out.print("Enter the score you have got in "+ subject[i]+ " :");
        subject_score[i] = scn.nextInt();
             System.out.println("Enterh the credith of "+subject[i] +" subject");
             credith[i] = scn.nextInt();
        }
        int result =  total_score(subject_score);
        System.out.println("                  -----===== INFORMATION =====-----");
        System.out.println("Your total number is:" + result);
        System.out.println("Your average is: "+ average(subject_score, credith, subject_length));
        System.out.println("Your maximam score is "+max(subject_score)) ;
        System.out.println("Your minimam score is "+min(subject_score)) ;

    }
   static int totalNum = 0;
   static int averages = 0;
    public static int average(int[] score , int[] credithPerSub,int totalSub){
    int totalcredith = 0;
        for(int i = 0 ; i < totalSub ; i++){
            totalNum = totalNum+ score[i]*credithPerSub[i];
            totalcredith += credithPerSub[i];
        }
        
        averages = totalNum / totalcredith ;
    return averages;
    }
    
    public static int total_score(int[] score){
        int totl_number = 0;
        for (int number : score){
          totl_number = totl_number +number ;
        }
        return totl_number;
    }
    public static int max(int[] input){
       int maximam = input[0];
       for(int number : input) {
        if (maximam < number) {
            maximam = number ;
        }

       }
       return maximam;
     }
     public static int min(int[] input){
       int minimam = input[0];
       for(int number : input) {
        if (minimam > number) {
            minimam = number ;
        }

       }
       return minimam;
     }
}