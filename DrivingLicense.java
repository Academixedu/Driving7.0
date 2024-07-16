import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        
        int id;
        String Name;
        int age;
        String address;

// Remaining Code Here

        System.out.println("enter name:");
        Name = a.nextLine();

        System.out.println("enter id");
        id = a.nextInt();  

        System.out.println("enter age");
        age = a.nextInt();
        
        System.out.println("enter address");
        address = a.next();
        
        if(age >= 18)
        {
            System.out.println("eligible to driving licences ");
        }
        else
        {
            System.out.println("Not eligible ");
        }

    }
}


