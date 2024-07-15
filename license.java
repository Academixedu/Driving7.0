import java.util.Scanner;
public class license{
    public static void main(String[] args){
       
        System.out.println("enter age");
        Scanner age = new Scanner(System.in);
        int number = age.nextInt();
        System.out.println("enter your name");
        Scanner name = new Scanner(System.in);
        String n = name.next();
        System.out.println("enter your id");
        Scanner id = new Scanner(System.in);
        int num = id.nextInt();
        System.out.println("enter your address");
        Scanner address = new Scanner(System.in);
        String a = address.nextLine();

        System.out.println("name is :" +n);
        System.out.println("age is :" +number);
        System.out.println("id is :"+num);
        System.out.println("address is :" +a);
        if(number>=18){
            System.out.println("person is eligible to license");
        }
        else{
            System.out.println("person is not eligible to license");
        }
        }

    }

