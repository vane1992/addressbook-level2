package seedu.addressbook.data.person;

public class Contact {
	public String STRING1 = "123456789";
    public String STRING2 = "Person phone numbers should only contain numbers";
    public String STRING3 = "\\d+";

    public String value;
    private boolean isPrivate;
    //constructor
    public Contact(String STRING1, String STRING2, String STRING3, String value, boolean isPrivate){
    	this.STRING1 = STRING1;
    	this.STRING2 = STRING2;
    	this.STRING3 = STRING3;
        this.isPrivate = isPrivate;
        this.value = value;
    }
    
    //common method
    public String toString() {
        return value;
    }
    //common method
    public int hashCode() {
        return value.hashCode();
    }
    //common method
    public boolean isPrivate() {
        return isPrivate;
    }
}