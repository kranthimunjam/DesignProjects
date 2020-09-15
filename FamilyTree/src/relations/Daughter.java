package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class Daughter implements Relation {

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		ArrayList<String> children;
		if(person.getGender().equals(Gender.FEMALE)) {
			children = person.getChildren();
		} else {
			PersonInterface personWife = familyTree.findFamilyMember(person.getPartner());
			children = personWife.getChildren();
		}
		ArrayList<PersonInterface> daughters = RelationUtils.getPeopleOfGender(Gender.FEMALE,
				RelationUtils.stringListToPersonList(children, familyTree));
		return daughters;
	}

}
