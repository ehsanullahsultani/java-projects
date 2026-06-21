import java.util.Scanner;

public class Salary_count {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("----==== Salary Of Employee ====----");
        System.out.println("Please enter number of employee:");
        int lenght = scn.nextInt();
        String[] employee = new String[lenght];
        int[] salary = new int[lenght];

        for( int i = 0 ; i < lenght ; i ++){
            System.out.print("Please enter the employee name: ");
            employee[i] = scn.next();
            System.out.print("please enter '"+ employee[i]+"' salary: ");
            salary[i] = scn.nextInt();
        }
        int x = 0 ;
        for ( String e : employee){
            System.out.println(x+1 +":" + e + " =" + salary[x]);
            x++ ; 
       }
        int loop = 1;
       while (loop == 1) {
        System.out.println("---=== Net Salary ===---");
       
       System.out.println("Now , choose an emloyee: (enter the number)");
       int employee_number = scn.nextInt();
       System.out.println("Enter " + employee[employee_number -1]+ " absent days:");
       int absent = scn.nextInt();
       System.out.println("Enter " + employee[employee_number -1]+ " overtime hours:");
       int overtime = scn.nextInt();
       int whloe_salary = calculate_salary(salary[employee_number- 1], absent, overtime);
      
       System.out.println("In this mount the salary of " +employee[employee_number -1] + " is " + whloe_salary +" AFG");
        System.out.println("If you want to calculate another employee press '1'\nIf you want to leave press any key (without '1')");
        loop = scn.nextInt();
       }
       System.out.println("Program succesfully finished.");
       
       

        
    }
     public static int calculate_salary(int gross_salary , int absent_days , int overtime_hours ) {
       float salary_per_day = (float)gross_salary /(float) 30 ;
       float salary_per_hour = salary_per_day / (float)8 ;
        int absent_amout = (int)(salary_per_day * absent_days) ; 
       float overtime_amout =  (float)overtime_hours * salary_per_hour;
       int net_salary = gross_salary + (int)overtime_amout - absent_amout ;
        return net_salary ;
     }
  
}