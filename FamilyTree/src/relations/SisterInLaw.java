package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class SisterInLaw implements Relation {

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		Siblings siblings = new Siblings();
		ArrayList<PersonInterface> partnerSiblings = siblings.of(person.getPartner(), familyTree);
		return RelationUtils.getPeopleOfGender(Gender.FEMALE, partnerSiblings);
	}

}
