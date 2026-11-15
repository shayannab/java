import java.util.Scanner;
public class scannerobj {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        System.out.print("what is your Name? ");
        String name=scanner.nextLine();

        System.out.print("what is your age? ");
        int age=scanner.nextInt();

        System.out.print("what is your gpa? ");
        double gpa=scanner.nextDouble();

        System.out.print("are you a student? ");
        boolean student=scanner.nextBoolean();


        System.out.println("my name is "+ name);
        System.out.println("my age is "+ age);
        System.out.println("my gpa is "+ gpa);
        if(student){
            System.out.println("I am a student!");
        }
        else{
            System.out.println("I am not a student!");
        }
        
        scanner.close();
    }
    
}
