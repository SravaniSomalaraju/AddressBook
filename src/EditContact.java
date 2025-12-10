import java.util.Scanner;

public class EditContact {

    public void editContact(AddressBook addressBook) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name of the contact you want to edit:");
        String name = sc.nextLine();

        Contact contact = addressBook.getContact(); // getter in AddressBook

        if (contact == null) {
            System.out.println("No contact found.");
            return;
        }

        if (contact.getFirstName().equalsIgnoreCase(name)) {
            System.out.println("Editing contact details...");

            System.out.print("Enter new Address: ");
            contact.setAddress(sc.nextLine());

            System.out.print("Enter new City: ");
            contact.setCity(sc.nextLine());

            System.out.print("Enter new State: ");
            contact.setState(sc.nextLine());

            System.out.print("Enter new Zip: ");
            contact.setZip(sc.nextLine());

            System.out.print("Enter new Phone Number: ");
            contact.setPhoneNumber(sc.nextLine());

            System.out.print("Enter new Email: ");
            contact.setEmail(sc.nextLine());

            System.out.println("Contact updated successfully!");

        } else {
            System.out.println("Contact not found with that name.");
        }
    }
}
