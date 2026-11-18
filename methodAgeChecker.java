import java.util.Scanner;
public class methodAgeChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age=scanner.nextInt();

        if (checkAge(age)){
            System.out.println("You may sign up!"); 
        }
        else{
            System.out.println("You need to be 18+ to sign up");
        }

        scanner.close();
    }

    static boolean checkAge( int age){
        if (age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
