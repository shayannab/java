import java.util.Scanner;
public class principalAmt {
    public static void main(String[] args) {
        //math practice
        Scanner scanner=new Scanner (System.in);
        double principalAmt;
        double rate;
        double interest;
        int years;

        System.out.print("enter the principal amount: ");
        principalAmt=scanner.nextDouble();
        System.out.print("enter the rate of compounding: ");
        rate=scanner.nextDouble();
        System.out.print("enter the interest: ");
        interest=scanner.nextDouble();
        System.out.print("enter the time period: ");
        years=scanner.nextInt();

        double amount = principalAmt * (Math.pow((1 + rate/interest),(interest*years) ));
        System.out.print("the amount you will get after " +years + " years is " +amount+ "/-" );



        scanner.close();

    }
    
}
