import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int id;
        String name;
        int age;
        String address;
        
        System.out.println("enter name");
        name = in.nextLine();

        System.out.println("enter id ");
        id = in.nextInt();

        

        System.out.println("enter age");
        age = in.nextInt();

        System.out.println("enter address");
        address = in.next();

        System.out.println("");
        
        if(age < 18)
        {
            System.out.println("Not Eligible for Driving License\n\n Age is less than 18\n age is "+age+"\n");
        }
        else{
            System.out.println("Eligible for Driving License\n");
        }

        System.out.println("DETAILS OF CANDIDATE");
        System.out.println("-----------------------");

        System.out.println("ID = "+id+"\nNAME = "+name+" \nAGE = "+age+" \nADDRESS = "+address);

        



    }
}
