package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;
import utils.RelationUtils;

public class MaternalAunt implements Relation {

	public MaternalAunt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<PersonInterface> of(String personName, FamilyTree familyTree) {
		PersonInterface person = familyTree.findFamilyMember(personName);
		PersonInterface personMother = familyTree.findFamilyMember(person.getMother());
		return RelationUtils.getPeopleOfGender(Gender.FEMALE, new Siblings().of(personMother.getName(), familyTree));
	}

}
