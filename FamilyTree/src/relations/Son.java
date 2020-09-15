package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class Son implements Relation {

	public Son() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		ArrayList<String> children;
		if (person.getGender().equals(Gender.FEMALE)) {
			children = person.getChildren();
		} else {
			PersonInterface personWife = familyTree.findFamilyMember(person.getPartner());
			children = personWife.getChildren();
		}
		ArrayList<PersonInterface> sons = RelationUtils.getPeopleOfGender(Gender.MALE,
				RelationUtils.stringListToPersonList(children, familyTree));
		return sons;
	}

}
