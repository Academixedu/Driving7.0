import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter id number");
        int id =in.nextInt();
        Scanner i=new Scanner(System.in);
        System.out.println("enter name");
        String name=i.nextLine();
        System.out.println("enter age");
        int age=in.nextInt();
        System.out.println("enter address");
        String address=i.nextLine();
    
    if(age>=18){
        System.out.println("ID:"+id);
        System.out.println("NAME:" +name);
        System.out.println("AGE:"+age);
        System.out.println("ADDRESS:"+address);
        System.out.println("you are eligble for  Drivinglicence");
    }
    else{
        System.out.println(" you are not eligble for licence");
    }
}
}
