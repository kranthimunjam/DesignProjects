package command;

import java.util.ArrayList;

import family.FamilyTree;
import people.PersonInterface;
import relations.Relation;
import relations.RelationsCreator;

public class RelativesFinder implements Command {
	private FamilyTree familyTree;

	private RelationsCreator relationsCreator;

	public RelativesFinder(FamilyTree familyTree, RelationsCreator relationsCreator) {
		this.familyTree = familyTree;
		this.relationsCreator = relationsCreator;
	}

	public void execute(String[] params) {
		try {
			String personName = params[1];
			String inputRelationName = params[2];
			Relation relation = relationsCreator.createRelation(inputRelationName);
			ArrayList<PersonInterface> relatives = relation.of(personName, familyTree);
			for (PersonInterface relative : relatives) {
				System.out.print(relative.getName() + " ");
			}
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("WRONG_INPUT_SYNTAX");
		} catch (UnsupportedOperationException e) {
			System.out.println("NONE");
		} catch (Exception e) {
			System.out.printf("INTERNAL_ERROR");
		}

	}

}
