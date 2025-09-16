import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String fixedUsername = "Ahmad Ali";
        final String fixedPassword = "12345";

        System.out.print("Please enter your username: ");
        String inputUsername = input.nextLine();

        if (inputUsername.equals(fixedUsername)){
            System.out.print("Please enter the password: ");
            String inputPassword =input.nextLine();

            if(inputPassword.equals(fixedPassword)){
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String currentTime = timeFormat.format(new Date());
            System.out.println("Welcome "+fixedUsername+". The time now is "+currentTime);
            }
            else {
                System.out.println("Error: Password does not match. ");
            }
            }else{
            System.out.println("Error: Invalid Username. ");
        }
        input.close();
    }
}
    

