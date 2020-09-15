package family;

import java.util.HashMap;

import command.Command;
import people.PersonInterface;

public class LengaburuFamilyTree implements FamilyTree {
	private HashMap<String, PersonInterface> familyMembers = new HashMap<>();

	public LengaburuFamilyTree() {

	}

	public PersonInterface findFamilyMember(String name) throws UnsupportedOperationException {
		if (familyMembers.containsKey(name)) {
			return familyMembers.get(name);
		} else {
			throw new UnsupportedOperationException("PERSON_NOT_FOUND");
		}

	}

	/**
	 * Adds person to the map for later retrieval.
	 */
	public void addFamilyMember(PersonInterface person) throws UnsupportedOperationException {
		if (!familyMembers.containsKey(person.getName())) {
			familyMembers.put(person.getName(), person);
		} else {
			throw new UnsupportedOperationException("Family Member already exists!! Name must be unique.");
		}

	}

	/**
	 * 
	 */
	public void executeCommand(Command command) {
		// TODO Auto-generated method stub

	}

	@Override
	public HashMap<String, PersonInterface> getFamilyMembers() {
		return familyMembers;
	}

}
