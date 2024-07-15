import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        System.out.println("enter id"); 
        int id =in.nextInt();
        System.out.println("enter name");
        String name =s.nextLine();
        System.out.println("enter age");
        int age =in.nextInt();
        System.out.println("enter address");
        String address =s.nextLine();
// Remaining Code Here
        if(age>18)
        {
            System.out.println("id is"+id);
            System.out.println("name is"+name);
            System.out.println("age is"+age);
            System.out.println("address is"+address);
        }
    
    }
}
