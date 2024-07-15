import java.util.Scanner;

public class DrivingLicense {
    public static void main(String[] args) {
        Scanner ion=new Scanner(System.in);
        System.out.println("enter id");
         int id = ion.nextInt();  
        System.out.println("enter name:");
        String name = ion.next();
        System.out.println("enter age");
        int age = ion.nextInt();
        System.out.println("enter address");
        String address = ion.next();
        if(age>=18){
            System.out.println("eligible to drive"+" "+"\n id:"+" "+id +"\n name:"+" "+name +" "+"\n age:"+" "+age +"\n address:"+" "+address);
        }
        else{
            System.out.println(" not eligible to drive"+" "+"\n id:"+" "+id +"\n name:"+" "+name +" "+"\n age:"+" "+age +"\n address:"+" "+address);
        }
    }
}
