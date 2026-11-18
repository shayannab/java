import java.util.Scanner;
public class dice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] food;
        int size;
        //user dice input
        System.out.print("enter the number of food you want: ");
        size = scanner.nextInt();
        food=new String[size];
        scanner.nextLine();
        for (int i=0; i <size; i++ ){
            System.out.print("enter the food: ");
            food[i]=scanner.nextLine();
        }

        for (String item:food){
            System.out.println(item);
        }

        scanner.close();


    }
}
