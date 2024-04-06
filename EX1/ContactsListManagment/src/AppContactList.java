public class AppContactList {
    public static void main(String[] args) throws Exception {
        ContactListInterface interfaceContactList = new ContactList();
        interfaceContactList.addContact("Victor", "(31)98718-5340");
        interfaceContactList.addContact("Maria", "(31)98745-6321");
        interfaceContactList.addContact("João", "(31)98765-4321");
        interfaceContactList.addContact("Ana", "(31)98765-1234");
        interfaceContactList.addContact("Pedro", "(31)98765-5678");
        interfaceContactList.addContact("Carla", "(31)98765-8765");
        interfaceContactList.searchContact("Victor");
        System.out.println(interfaceContactList.listContacts());
    }
}
