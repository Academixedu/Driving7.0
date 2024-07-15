import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      
        System.out.println("Enter your id");
        int id=in.nextInt();

        System.out.println("Enter your name");
        in.nextLine();
        String name=in.nextLine();

        System.out.println("Enter your age");
        int age=in.nextInt();

        System.out.println("Enter your address");
        in.nextLine();
        String address=in.nextLine();

        System.out.println("enter id > " +id );
        System.out.println("Enter your name > "+ name);
        System.out.println("Enter your age > " + age);
        System.out.println("Enter your address > "+ address);

        if (age > 18){
 
        System.out.println("you are eligible for driving licence");

        }
        else 
        {
        System.out.println("yor are not eligible ");
        }    

   




    }
}
