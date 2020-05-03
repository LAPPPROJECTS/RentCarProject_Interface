package interfac;

public class Interface {
   public void interfaceStart() {
       System.out.println("Van Rental Services:");
       System.out.println("1 - Van List");
       System.out.println("2 - Log in/Register");  // sing in -> admin -> panel administrato
                                           //         -> user -> user interface
       System.out.println("3 - Exit");
      ChoseOptions options = new ChoseOptions();
      options.chose();

    }
}
