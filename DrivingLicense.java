import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your id number:");
        int id = in.nextInt();
        System.out.println("Enter your name:");
        String name = in.next();
        System.out.println("Enter your age:");
        int age = in.nextInt() ;
        System.out.println("Enter your address:");
        String address = in.next();
        if (age>=18){
            System.out.println("Your license has been approved"+" "+"\n Id:"+" "+id+" "+"\n Name:"+" "+name+"\n Age:"+" "+age+" "+"\n Address:"+" "+address);
                }
                else{
                    System.out.println("Your license has been dis-approved"+" "+"\n Id:"+" "+id+" "+"\n Name:"+" "+name+"\n Age:"+" "+age+" "+"\n Address:"+" "+address);}

    }
}