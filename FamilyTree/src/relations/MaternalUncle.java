package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class MaternalUncle implements Relation {

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		PersonInterface personMother = familyTree.findFamilyMember(person.getMother());
		return RelationUtils.getPeopleOfGender(Gender.MALE, new Siblings().of(personMother.getName(), familyTree));
	}

}
