import java.util.ArrayList;

public class ContactList implements ContactListInterface {
    private ArrayList<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    @Override
    public void addContact(String name, String number) {
        contacts.add(new Contact(name, number));

    }

    @Override
    public void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getName() == name) {
                System.out.println(c.toString());
                break;
            } else {
                System.out.println("O nome digitado não está na lista de contatos.");
            }
        }
    }

    @Override
    public String listContacts() {
        StringBuilder stringBuilder = new StringBuilder();

        if (contacts.isEmpty()) {
            return "A lista de contatos está vazia.";
        } else {
            stringBuilder.append("Lista de Contatos:\n");
            for (Contact contact : contacts) {
                stringBuilder.append(contact.toString()).append("\n");
            }
            return stringBuilder.toString();
        }
    }

}
