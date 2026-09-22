import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AddressBook {

    private Collection<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo p) {
        buddies.add(p);
    }

    public void removeBuddy(BuddyInfo p) {
        buddies.remove(p);
    }
}
