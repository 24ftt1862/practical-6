import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthNumber = 0;
        String monthName = "";

        String set1 = "1 3 5 7 9 11";
        String set2 = "2 3 6 7 10 11";
        String set3 = "4 5 6 7 12";
        String set4 = "8 9 10 11 12";

        System.out.println("Is your birth month in Set 1? ");
        System.out.println(set1);
        System.out.println("Enter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();
        if (answer == 1){
            monthNumber+=1;
        }
        System.out.println("Is your birth month in Set 2? ");
        System.out.println(set2);
        System.out.println("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            monthNumber+=2;
        }
        System.out.println("Is your birth month in Set 3? ");
        System.out.println(set3);
        System.out.println("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            monthNumber+=4;
        }
        System.out.println("Is your birth month in Set 4? ");
        System.out.println(set4);
        System.out.println("Enter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            monthNumber+=8;
        }
        switch (monthNumber){
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "Unknown";    
        }
        System.out.println("You are born in "+monthName);
        input.close();
    }
}
