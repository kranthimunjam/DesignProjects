package command;

import family.FamilyTree;
import people.PersonInterface;

public class MakePartners implements Command {
	private FamilyTree familyTree;


	public MakePartners(FamilyTree familyTree) {
		this.familyTree = familyTree;
	}

	@Override
	public void execute(String[] params) {
		try {
			String firstPersonName = params[1];
			String secondPersonName = params[2];
			PersonInterface firstPerson = familyTree.findFamilyMember(firstPersonName);
			PersonInterface secondPerson = familyTree.findFamilyMember(secondPersonName);
			// I'm assuming that this is not allowed.
			if (firstPerson.getGender().equals(secondPerson.getGender())) {
				throw new UnsupportedOperationException("Gender is same!!");
			}
			firstPerson.addPartner(secondPersonName);
			secondPerson.addPartner(firstPersonName);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("WRONG_INPUT_SYNTAX");
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.print("INTERNAL_ERROR");
		}

	}

}
