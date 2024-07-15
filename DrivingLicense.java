import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int id;
        String name;
        int age;
        String address;
        System.out.println("Enter your Id");
        id = a.nextInt();
        System.out.println("Enter your Name");
        name = a.next();
        System.out.println("Enter your Age");
        age = a.nextInt();
        System.out.println("Enter your Address");
        address = a.next
        ();
        if(age>=18|| age==18)
        {
            System.out.println("Eligible for Driving licence"); 
        }
        else{
            System.out.println("Not Eligible for Driving licence"); 
        }
        }
    }
