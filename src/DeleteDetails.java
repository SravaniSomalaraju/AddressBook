import java.util.Iterator;
import java.util.Scanner;

public class DeleteContact {

    public void deleteByName(AddressBook addressBook) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name to delete:");
        String name = sc.nextLine();

        Iterator<Contact> iterator = addressBook.getContacts().iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getFirstName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
}
}