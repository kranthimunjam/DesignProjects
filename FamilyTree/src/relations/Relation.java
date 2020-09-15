package relations;

import java.util.ArrayList;

import family.FamilyTree;
import people.PersonInterface;

public interface Relation {

	ArrayList<PersonInterface> of(String personName, FamilyTree familyTree);

}
