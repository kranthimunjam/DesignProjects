package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.PersonInterface;
import utils.RelationUtils;

public class Siblings implements Relation {

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		PersonInterface personMother = familyTree.findFamilyMember(person.getMother());
		ArrayList<String> siblings = personMother.getChildren();
		ArrayList<PersonInterface> siblingsPerson = RelationUtils.stringListToPersonList(siblings, familyTree);
		siblingsPerson.remove(person);
		return siblingsPerson;
	}

}
