import java.util.Scanner;
public class asec12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        double num1= input.nextDouble();

        System.out.print(" Second number: ");
        double num2 = input.nextDouble();

        System.out.println("Third number:");
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);
       
    }
    
}
