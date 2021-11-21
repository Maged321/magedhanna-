package lab_5;
import java.util.Scanner;
class Lab_5 {

   
    public static void main(String[] args) {
 
        Scanner input =new Scanner (System.in);
        
        MemberFactory getMember=new MemberFactory();
        System.out.println("Enter your member factory please  : ");
        String member=input.next();
          System.out.println("Enter units please  : ");
          int units =input.nextInt();
          System.out.println("Enter units please  : ");
          int start_year=input.nextInt();
        Staff s =getMember.getMemberFactory(member);
        s.GetSalary(units);
        s.getYearsOfWork(start_year);
    
    }
    
}
