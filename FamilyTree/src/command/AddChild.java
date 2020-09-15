package command;

import family.FamilyTree;
import people.Gender;
import people.PeopleFactory;
import people.PersonInterface;

public class AddChild implements Command {
	private FamilyTree familyTree;

	private PeopleFactory peopleFactory;

	public AddChild(FamilyTree familyTree, PeopleFactory peopleFactory) {
		this.familyTree = familyTree;
		this.peopleFactory = peopleFactory;
	}

	/**
	 * this method does following things: 1. creates new person(child) 2. links
	 * person with parent 3. adds new person to the familyTree to be able to search
	 * by name.
	 */
	public void execute(String[] params) {
		try {
			String motherName = params[1];
			String childName = params[2];
			Gender gender = Gender.valueOf(params[3].toUpperCase());
			// creates new person => Child.
			PersonInterface child = peopleFactory.createPerson(childName, motherName, gender);
			// retrieves mother object by using name.
			PersonInterface mother = familyTree.findFamilyMember(motherName);
			familyTree.addFamilyMember(child);
			mother.addChild(childName);
			child.setFather(mother.getPartner());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("WRONG_INPUT_SYNTAX");
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.print("INTERNAL_ERROR");
		}

	}

}
