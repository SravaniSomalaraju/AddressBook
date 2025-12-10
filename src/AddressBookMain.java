import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact contact = new Contact();

        System.out.println("Enter First Name:");
        contact.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name:");
        contact.setLastName(sc.nextLine());

        System.out.println("Enter Address:");
        contact.setAddress(sc.nextLine());

        System.out.println("Enter City:");
        contact.setCity(sc.nextLine());

        System.out.println("Enter State:");
        contact.setState(sc.nextLine());

        System.out.println("Enter Zip:");
        contact.setZip(sc.nextLine());

        System.out.println("Enter Phone Number:");
        contact.setPhoneNumber(sc.nextLine());

        System.out.println("Enter Email:");
        contact.setEmail(sc.nextLine());

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact);
        addressBook.displayContact();
}
}