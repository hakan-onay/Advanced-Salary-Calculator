
package advancedsalarycalculator;

import java.util.Scanner;


public class AdvancedSalaryCalculator {
    

   
    public static void main(String[] args) {
      
        
        //1. Part
       Scanner input = new Scanner(System.in);
       
        System.out.println("Write down your hourly wage please");
        double hourlyWage = input.nextDouble();
        
        System.out.println("Write down your weekly working hours please");
        double weeklyWorkingHours = input.nextDouble();
        
        System.out.println("Write down your overtime hours please");
        double overtimeHours = input.nextDouble();
        
        System.out.println("Your hourly wage = "+hourlyWage);
        System.out.println("Your weekly working hours = "+weeklyWorkingHours);
        System.out.println("Your overtime hours = "+overtimeHours);
        
        //2. Part
        double salary = ((hourlyWage*weeklyWorkingHours))+(overtimeHours*hourlyWage);
        
        System.out.println("Your weekly salary is = "+salary);
        
        //3. Part
        
        double healthTax = (salary*15)/100;
        double tax = (salary*5)/100;
        
        System.out.println("Your health tax is = "+healthTax);
        System.out.println("Your tax is = "+tax);
        
        //4. Part
        
        double netSalary = (salary)-(tax+healthTax);
        System.out.println("Your net salary is = "+netSalary);
        
        //5. Part
        
        System.out.println("Your rounded salary is = "+Math.ceil(netSalary));
        
        
        
        
        
        
        
       
        
    
    
   
               
    }
    
}
