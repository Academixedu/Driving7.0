import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    
        
       

        System.out.println("enter your id ");
        int id=in.nextInt();

        System.out.println("eter your name ");
        in.nextLine();
        String name=in.nextLine();
      

        System.out.println("enter Age");
        int age=in.nextInt();

        System.out.println("enter address");
        in.nextLine();
        String address=in.nextLine();
        

        System.out.println("enter id >> " +id);
        System.out.println("enter name >>" + name);
        System.out.println("enter age >>" + age);
        System.out.println("enter address >>" + address);

        if (age>=18) {
            System.out.println("are you eligible");
            
        } else {
            System.out.println("your not eligible");
            
        }
      
    }
}
