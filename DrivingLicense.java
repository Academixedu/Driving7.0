import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter id");
        int id=in.nextInt();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter age");
       
        int age=in.nextInt();
        System.out.println("enter address");
        String address=sc.nextLine();
        if (age>=18){

            System.out.println("ID: "+id);
            System.out.println("NAME: "+name);
            System.out.println("ADDRESS : "+address);
            System.out.println("Yor are eligible for driving license ");
        }
        else{
        
           
            System.out.println("Yor are not eligible for driving license");
        }
    }
}

    

