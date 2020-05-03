package adminPanel;

public class AdminInterface {
    public void adminOptopons(){
        System.out.println("Admin panel, select an option:");
        System.out.println("1 - Van List"); // Car list add/remove to the list
        System.out.println("4 - Information's about reservations"); // (Pawel -informacja ktore samochody sa wolne lub zajete w danym terminie I kto je wypozyczyl, ewentualnie tak jak Lukasz zucil temat czy van wymaga servisowania, i zwrot vanow od klientow i anulowanie rezerwacji)
        System.out.println("5 - Customers list");  //(Pawel - ewentualnie w srodku mozna dodac historie klienta i tez możliwość usuniecia klienta, tu bym też umiescil wysyłanie komunikatow do klienta)
        System.out.println("6 - Return to the main interface");
        System.out.println("7 - Exit");

    }

}
