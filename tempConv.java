import java.util.Scanner;
public class tempConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;
        System.out.print("enter the temprature: ");
        temp=scanner.nextDouble();
        System.out.print("convert it to C or F: ");
        unit=scanner.next().toUpperCase();
        newTemp= (unit.equals("C")) ? (temp-32)*5/9 : (temp*9/5)+32;
        System.out.println("The temperature is "+newTemp+" degrees "+unit);
        scanner.close();
    }


    
}
