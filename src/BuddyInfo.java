public class BuddyInfo {

    private String name;
    private String address;
    private int phonenumber;

    public BuddyInfo() {
        this.name = "Sajana";
        this.address = "idk";
        this.phonenumber = 1111111111;
    }

    public BuddyInfo(String name, String address, int phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhonenumber() {return phonenumber; }

    static void main() {
        BuddyInfo buddyInfo = new BuddyInfo();
        System.out.println("Hello " + buddyInfo.name);
    }
}
