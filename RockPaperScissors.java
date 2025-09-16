import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int program = (int)(Math.random()*1000)%3;

    System.out.print("Enter rock (0), paper (1), scissor(2) ");
    int user = input.nextInt();

    if (program==0)
        System.out.print("The computer is rock.");
    if (program==1)
        System.out.print("The computer is paper.");
    if (program==2)
        System.out.print("The computer is scissor.");

    if (user==0)
        System.out.print("You are are rock.");
    if (user==1)
        System.out.print("You are are paper.");
    if (user==2)
        System.out.print("You are are scissor.");
    
    if (program==user){
        System.out.print("It is a draw.");
    }
    if (program==0 & user==1){
        System.out.print("You win.");
    }
    if (program==0 & user==2){
        System.out.print("You lose.");
    }
    if (program==1 & user==0){
        System.out.print("You lose.");
    }
    if (program==1 & user==2){
        System.out.print("You win.");
    }
    if (program==2 & user==0){
        System.out.print("You win.");
    }
    if (program==2 & user==1){
        System.out.print("You lose.");
    }
    input.close();
    }
}
