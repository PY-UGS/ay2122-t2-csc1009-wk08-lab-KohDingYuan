import java.util.Scanner;

public class Week08 {
    Scanner input = new Scanner(System.in);

    public void tutQuestion01(){
        CircleWithException circle = new CircleWithException();
        String userInput;
        try{
            System.out.print("Enter radius of circle: ");
			userInput = input.nextLine();
            circle.setRadius(Double.parseDouble(userInput));

            System.out.println("Area of circle: " + circle.getArea());
            System.out.println("Diameter of circle: " + circle.getDiameter());
        }
        catch(NumberFormatException nfe){
            System.out.println("Input a double you pendejo");
        }
        catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void tutQuestion02(){
        CheckingAccount ca = new CheckingAccount(12345, 1000);

        System.out.println("Input deposit amount: ");
        double depositvalue = input.nextDouble();
        ca.deposit(depositvalue);
        try
        {
            System.out.println("Input withdrawal amount: ");
            double value = input.nextDouble();
            ca.withdraw(value);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.getClass().getSimpleName()+" Sorry but your account is short by "+e.getAmount());
        }
    }
}