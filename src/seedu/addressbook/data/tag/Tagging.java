package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;

public class Tagging {
	//implement Person and Tag classes
	Person people;
	Tag tag;
	String ADDED = "abc";
	String DELETED = "def";
	public Name getname(){
		return people.fullname;
	}
	public String gettagname(){
		return tag.tagName;
	}
}