package adminPanel;

import java.util.Scanner;

public class AdminLogin {
    Scanner scanner = new Scanner(System.in);
    AdminInterface adminInterface = new AdminInterface();
    public void loginAdmin(){
        String error ="There is a problem with the information you have submitted";
        System.out.println("Admin Panel");
        System.out.println("Please enter your username:");
        System.out.println("Username: (narazie Admin)");
        String username= scanner.nextLine();
        switch (username){
            case "Admin": // narazie do uproszczenia, mozna zrobić liste adminow
                System.out.println("Password: ( narazie admin)");
                String adminPassword = scanner.nextLine();

                                switch (adminPassword){
                    case "admin":
                        adminInterface.adminOptopons();
                        break;
                    default:
                        System.out.println(error);
                        break;
                }
                break;
            default:
                System.out.println(error);
                break;

        }

    }
}
