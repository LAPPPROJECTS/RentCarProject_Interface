package interfac;

import java.util.Scanner;

public class ChoseOptions {
     Scanner scanner= new Scanner(System.in);
    protected void chose() {
        int choseNumber=0;
        do{
        System.out.println("Choose options:");
        choseNumber = scanner.nextInt();

            switch (choseNumber){
                case 1:
                    System.out.println(" Tu wyświetli się lista samochodow");

                    break;

                case 2:
                    System.out.println(" Tu wyświetli się panel do logowania");
                    break;
                case 3:
                    System.out.println(" Rejestracja nowego klienta");
                    break;
                case 4:
                    System.out.println("Tu wyświetli się panel administratora");
                    break;
                case 5:
                    System.out.println(" Exit from Van Rental Services, have a nice day");
                    break;
                default:
                    System.out.println("There is no such option, select again: 1, 2, 3, 4 or 5");
                    break;
            }

        } while (choseNumber!=5);
    }
}
