
import java.util.Scanner;

public class Drivinglicense {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter your id");
        int id = scan.nextInt();
        System.out.println("enterd id"+id);
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name = in.nextLine();
        System.out.println("enterd your name "+name);
        Scanner age = new Scanner(System.in);
        int num = age.nextInt();
        if (num > 18) {
           System.out.println("eligible for driving license");
        }else{
            System.out.println("not eligible for driving license");
        }
        Scanner address = new Scanner(System.in);
        System.out.println("enter your adress");
        String a = address.nextLine();
        System.out.println("enterd your adress"
        );
    }

}
