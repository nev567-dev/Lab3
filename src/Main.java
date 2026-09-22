public class Main {
    public static void main(String[] args){
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Sajana", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
