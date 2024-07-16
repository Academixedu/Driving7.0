
import java.util.Scanner;
public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter id");
        int id=in.nextInt();
        System.out.println("enter name");
        String name=in.next();
        System.out.println("enter age");
        int age=in.nextInt();
        System.out.println("enter address");
        String address=in.next();
// Remaining Code Here
if(age>18)
{
    System.out.println("id="+id);
    System.out.println("name="+name);
    System.out.println("age="+age);
    System.out.println("address="+address);
}
    }
}
