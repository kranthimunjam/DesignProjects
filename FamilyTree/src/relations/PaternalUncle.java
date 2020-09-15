package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class PaternalUncle implements Relation {

	public PaternalUncle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		PersonInterface personFather = familyTree.findFamilyMember(person.getFather());
		ArrayList<PersonInterface> fatherSiblings = new Siblings().of(personFather.getName(), familyTree);
		return RelationUtils.getPeopleOfGender(Gender.MALE, fatherSiblings);
	}

}
