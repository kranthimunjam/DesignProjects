package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class BrotherInLaw implements Relation {

	public BrotherInLaw() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		Siblings siblings = new Siblings();
		ArrayList<PersonInterface> partnerSiblings = siblings.of(person.getPartner(), familyTree);
		return RelationUtils.getPeopleOfGender(Gender.MALE, partnerSiblings);
	}

}
