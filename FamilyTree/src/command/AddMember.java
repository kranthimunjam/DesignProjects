package command;

import family.FamilyTree;
import people.Gender;
import people.PeopleFactory;
import people.PersonInterface;

public class AddMember implements Command {
	private FamilyTree familyTree;

	private PeopleFactory peopleFactory;

	public AddMember(FamilyTree familyTree, PeopleFactory peopleFactory) {
		this.familyTree = familyTree;
		this.peopleFactory = peopleFactory;
	}

	@Override
	public void execute(String[] params) {
		String personName = params[1];
		Gender gender = Gender.valueOf(params[2].toUpperCase());
		PersonInterface person = peopleFactory.createPerson(personName, null, gender);
		familyTree.addFamilyMember(person);
	}

}
