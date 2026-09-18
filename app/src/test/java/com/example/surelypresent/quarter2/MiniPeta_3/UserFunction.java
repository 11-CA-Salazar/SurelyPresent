
import java.util.Scanner;

public class UserFunction {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("==== WELCOME BACK =====");
            System.out.println("1: Admin");
            System.out.println("2. Teacher");
            System.out.println("3. Student");

            choice = scanner.nextInt();


            if (choice < 1 || choice > 3){
                System.out.println("invalid choice, please try again");
            }else if(choice == 1){
                System.out.println(" ===Welcome back Admin!=== ");
                System.out.println("1. Home");
                System.out.println("2. Settings");
                System.out.println("3. Profile");
                System.out.println("4. Class list");

                choice = scanner.nextInt();

                if (choice == 1 ){
                    System.out.println("|---------------|")
                    System.out.prtitln("|               |" );
                }

            }else if(choice == 2){
                System.out.println(" ===Welcome back Teacher!=== ");
                System.out.println("1. Home");
                System.out.println("2. Settings");
                System.out.println("3. Profile");
                System.out.println("4. Attedance");

                choice = scanner.nextInt();

            }else if(choice == 3){
                System.out.println(" ===Welcome back dear student!=== ");

                System.out.println("1. Home");
                System.out.println("2. Settings");
                System.out.println("3. Profile");

                choice = scanner.nextInt();

            }
        } while (choice < 1 || choice > 3);

        scanner.close();


    }
}
