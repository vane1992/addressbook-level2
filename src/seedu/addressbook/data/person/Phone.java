package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's phone number in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPhone(String)}
 */
public class Phone extends Contact{

    public static final String EXAMPLE = "123456789";
    public static final String MESSAGE_PHONE_CONSTRAINTS = "Person phone numbers should only contain numbers";
    public static final String PHONE_VALIDATION_REGEX = "\\d+";

    public final String value = "0";
    public boolean isPrivate;

    /**
     * Validates given phone number.
     *
     * @throws IllegalValueException if given phone string is invalid.
     */
    public Phone(String EXAMPLE, String MESSAGE_PHONE_CONSTRAINTS, String PHONE_VALIDATION_REGEX, String value, boolean isPrivate){
    	super(EXAMPLE, MESSAGE_PHONE_CONSTRAINTS, PHONE_VALIDATION_REGEX, value, isPrivate);
    }
    /**
     * Checks if a given string is a valid person phone number.
     */
    public static boolean isValidPhone(String test) {
        return test.matches(PHONE_VALIDATION_REGEX);
    }
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Phone // instanceof handles nulls
                && this.value.equals(((Phone) other).value)); // state check
    }
	public boolean isPrivate() {
		return super.isPrivate();
	}
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
