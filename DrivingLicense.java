import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your age");
        int age = scan.nextInt();

        System.out.println("enter your name");
        String name = scan.next();
        
        System.out.println("enter your id");
        int id = scan.nextInt();

        System.out.println("enter your address");
        String address = scan.next();

        if(age<18){
            System.out.println("you are not eleguble for driving lisence");
        }
        else{
            System.out.println("you are eleguble for driving lisence");
        }
    }
}
