import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int id;
        String name;
        int age;
        String address;
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.print("Enter your Id: ");
        id = in.nextInt();
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.print("Enter your address: ");
        address = in.next();

        if(age>=18){
            System.out.println("This candidate is Eligible for DrivingLicense");
            System.out.println("Name: "+name+"\n Id: "+id+"\n Age: "+age+"\n Address: "+address);
        }
        else{
            System.out.println("This candidate is not Eligible for DrivingLicense");
            System.out.println("Name: "+name+"\n Id: "+id+"\n Age: "+age+"\n Address: "+address);
        }
    }
}
