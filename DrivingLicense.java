import java.util.Scanner;
public class DrivingLicense{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Enter the ID");
        int ID =s.nextInt();
        s.nextLine();

        System.out.println("Enter the Name ");
        String Name=s.nextLine();

        System.out.println("Enter the Adress");
        String Adress =s.nextLine();

        System.out.println("Enter the Age");
        int Age =s.nextInt();
        s.nextLine();

        if(Age>18)
        { 
            System.out.println( "Congratulations.....!! Your Eligible for Driving Licence" );


        }
        else
System.out.println("Your not Eligible");
    }

}
