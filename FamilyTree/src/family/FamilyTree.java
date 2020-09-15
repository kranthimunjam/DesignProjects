package family;

import java.util.HashMap;

import command.Command;
import people.PersonInterface;

public interface FamilyTree {
	PersonInterface findFamilyMember(String name) throws UnsupportedOperationException;

	void addFamilyMember(PersonInterface person) throws UnsupportedOperationException;

	void executeCommand(Command command);

	HashMap<String, PersonInterface> getFamilyMembers();
}
