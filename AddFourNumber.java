import java.util.Random;
import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);
        int num4 = random.nextInt(100);

        int sum = num1+num2+num3+num4;

        System.out.printf("What is %d+%d%+d+%d ?\n",num1,num2,num3,num4);
        System.out.print("Enter your answer ");
        int userAnswer = input.nextInt();

        if (userAnswer == sum){
            System.out.print("Well done, you are correct! ");
        }
        else{
            System.out.printf("Nice try, the sum should be %d\n ", sum);
        }
        input.close();
    }
}
