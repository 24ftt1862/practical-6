import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression: ");
        
        int a = input.nextInt();
        String operator = input.next();
        int b = input.nextInt();
 

        switch (operator) {
            case "+":
            System.out.println("The sum is "+(a + b));
            break;
        case "-":
            System.out.println("The subtraction is "+(a - b));
            break;
        case "*":
            System.out.println("The multiplication is "+(a * b));
            break;
        case "/":
            if (b==0){
                System.out.println("Math error: The divisor cannot be Zero");
            } else {
            System.out.println("The division is "+(a / b));
            }
            break;
            default:
            System.out.println("Invalid operator "+operator);
            break;
        }
        input.close();
    }
}
