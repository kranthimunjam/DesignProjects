package utils;

import java.util.ArrayList;

import family.FamilyTree;
import people.Gender;
import people.PersonInterface;

public class RelationUtils {

	public static ArrayList<PersonInterface> getPeopleOfGender(Gender gender, final ArrayList<PersonInterface> people) {
		ArrayList<PersonInterface> result = new ArrayList<PersonInterface>();
		for (PersonInterface person : people) {
			if (person.getGender().equals(gender)) {
				result.add(person);
			}
		}
		return result;
	}

	/**
	 * Converts lists of Strings into list of Objects of type PersonInterface.
	 * 
	 * @param relatives
	 * @param familyTree
	 * @return
	 */
	public static ArrayList<PersonInterface> stringListToPersonList(ArrayList<String> relatives,
			FamilyTree familyTree) {
		ArrayList<PersonInterface> relativesPersons = new ArrayList<PersonInterface>();
		for (String relative : relatives) {
			relativesPersons.add(familyTree.findFamilyMember(relative));
		}
		return relativesPersons;
	}
}
