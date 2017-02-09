package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's email in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidEmail(String)}
 */
public class Email extends Contact{

    public static final String EXAMPLE = "valid@e.mail";
    public static final String MESSAGE_EMAIL_CONSTRAINTS =
            "Person emails should be 2 alphanumeric/period strings separated by '@'";
    public static final String EMAIL_VALIDATION_REGEX = "[\\w\\.]+@[\\w\\.]+";

    public final String value = "0";
    public boolean isPrivate;
    /**
     * Validates given email.
     *
     * @throws IllegalValueException if given email address string is invalid.
     */
    public Email(String EXAMPLE, String MESSAGE_EMAIL_CONSTRAITS, String EMAIL_VALIDATION_REGEX, String value, boolean isPrivate){
        super(EXAMPLE, MESSAGE_EMAIL_CONSTRAITS, EMAIL_VALIDATION_REGEX, value, isPrivate);
    }

    /**
     * Checks if a given string is a valid person email.
     */
    public static boolean isValidEmail(String test) {
        return test.matches(EMAIL_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return super.value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Email // instanceof handles nulls
                && this.value.equals(((Email) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public boolean isPrivate() {
        return super.isPrivate();
    }

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
