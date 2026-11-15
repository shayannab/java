import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("what is your item? ");
        String items=scanner.nextLine();

        System.out.print("what is the unit prize of " + items+" ? ");
        double price=scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity=scanner.nextInt();

        double total=price*quantity;

        System.out.println("Today, I brought " + quantity+ " packs of " + items +" from the supermarket and it costed me total of "+ total);

        scanner.close();

    }

    
}
