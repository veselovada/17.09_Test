package third_test;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.addContact("Arseniy", "+7-923-324-5231");
        addressBook.addContact("Nazar", "+7-953-364-0295");

        String aliceArseniy = addressBook.getPhone("Arseniy");
        System.out.println("phone number Arseniy: " + aliceArseniy);
        addressBook.removeContact("Ivetta");
        addressBook.removeContact("Demyan");

        addressBook.printAllContacts();
    }
}
