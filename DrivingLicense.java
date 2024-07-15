import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the id ");
        int id=in.nextInt();
       
 
         System.out.println("Enter the Name");
         String name = in.nextLine();
        in.nextLine();
        
         System.out.println("Enter the Age");
         int age=in.nextInt();
        
          System.out.println("Enter the Addres");
         in.nextLine();
         String address=in.nextLine();
         
         System.out.println("Entered id "+ id);
         System.out.println("Entered Name "+ name);
         System.out.println("Entered Age "+age);
         System.out.println("Entered Address "+ address); 
 
         if(age>=18)
         {
           System.out.println("Congratulation..!!!! You are eligible for Driving Licence");
         }
         else
         {
           System.out.println("Sorry!!..You are not eligible for driving Licence");
         }
     }
}
