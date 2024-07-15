import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int id;
        String name;
        int age;
        String address;
// Remaining Code Here
        System.out.println("Enter your Name");
        name = obj.nextLine();

        System.out.println("Enter Id ");
        id = obj.nextInt();

        System.out.println("Enter Age");
        age = obj.nextInt();

        System.out.println("Enter Address");
        address = obj.next();

        System.out.println(" ");


//check eligibility for driving license

        if(age>=18){
            System.out.println("Eligible for driving license");
        }else{
         System.out.println("Not Eligible for Driving License");
        }
    }  
}


