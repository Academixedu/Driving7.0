import java.util.Scanner;

public class license {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int id;
        String name;
        int age;
        String address;
// Remaining Code Here
        
        System.out.println("Enter your name:");
         name = scan.next(); 
        
        System.out.println("Enter your ID:");
        id = scan.nextInt();
        
        System.out.println("Enter your age:");
        age= scan.nextInt();

        System.out.println("Enter your address:");
         address = scan.next();
        

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
         if (age>=18) {
                System.out.println("Elegable to drive");
                
         } else  {
                System.out.println("Not elegable to drive");
    
         }

}
}