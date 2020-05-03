package customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

@Getter
@AllArgsConstructor
public class AddCustomer {


    private String name;
    private String lastName;
    private String password1Input;
    private String password2Input;
    private String phoneNumber;
    private String emailAddress;

    private void createCustomer(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name> ");
        name = in.nextLine();
        System.out.print("Enter last name> ");
        lastName = in.nextLine();
        System.out.print("Enter password> ");
        password1Input = in.nextLine();
        System.out.print("Repeat password> ");
        password2Input = in.nextLine();
        System.out.print("Enter phoneNumber> ");
        phoneNumber = in.nextLine();
        System.out.print("Enter email addres> ");
        emailAddress = in.nextLine();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;

        try{
            builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element customer = document.createElement("Customer");
            document.appendChild(customer);

            Element userName = document.createElement("UserName");
            Element userPassword = document.createElement("Password");
            Element userLastName = document.createElement("LastName");
            Element userPhoneNumber = document.createElement("PhoneNumber");
            Element userEmailAddress = document.createElement("EmailAddress");


            if(name.matches("[A-Za-z]+")) {
                userName.appendChild(document.createElement(name));
            }
            if(password1Input != null && password1Input.equals(password2Input)) {
                userPassword.appendChild(document.createTextNode(password1Input));
            }
            if(lastName.matches("[A-Za-z]+")) {
                userLastName.appendChild(document.createTextNode(lastName));
            }
            if(phoneNumber.matches("\\d{10}")) {
                userPhoneNumber.appendChild(document.createTextNode(phoneNumber));
            }
            //TODO add email format checker
            //TODO wyrazenia regularne ??

            userEmailAddress.appendChild(document.createTextNode(emailAddress));


            customer.appendChild(userName);
            customer.appendChild(userPassword);
            customer.appendChild(userLastName);
            customer.appendChild(userPhoneNumber);
            customer.appendChild(userEmailAddress);



            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/main/resources/customers"));

            transformer.transform(source, result);



        } catch (ParserConfigurationException | NullPointerException | TransformerException e)  {
            e.printStackTrace();
        }

    }

}
//TODO Paulina       metoduy wypozyczania i zwracania aut

//TODO Pawel         login do systemu  i weryfikacja maila

//TODO Artur         custumerHistory metoda do obliczania ceny za wynajete auto (perday 35, a po 3 dniach taniej np o 5%)

//TODO Lukasz        Baza aut w XML