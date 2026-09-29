public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this.name = "Sajana";
        this.address = "idk";
        this.phoneNumber = "1111111111";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo();
        System.out.println("Hello " + buddyInfo.name);
    }
}