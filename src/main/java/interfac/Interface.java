package interfac;

public class Interface {
   public void interfaceStart() {
       System.out.println("Van Rental Services:");
       System.out.println("1 - Van List");
       System.out.println("2 - Sign in");
              System.out.println("3 - Register");
              System.out.println("4 - Login to admin panel\n");
       System.out.println("5 - Exit");
      ChoseOptions options = new ChoseOptions();
      options.chose();

    }
}
