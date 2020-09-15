package command;

import family.FamilyTree;
import people.PeopleFactory;
import relations.LBRelationCreator;

public class LBCommandFactory implements CommandFactory {
	private Command addChildCommand;
	private Command addMemberCommand;
	private Command makePartnersCommand;
	private RelativesFinder relativesFinder;


	public LBCommandFactory(FamilyTree familyTree, PeopleFactory peopleFactory) {
		this.addChildCommand = new AddChild(familyTree, peopleFactory);
		this.addMemberCommand = new AddMember(familyTree, peopleFactory);
		this.makePartnersCommand = new MakePartners(familyTree);
		this.relativesFinder = new RelativesFinder(familyTree, new LBRelationCreator());
	}

	@Override
	public Command getCommand(final String input_command) {
		if (input_command.equals("ADD_MEMBER")) {
			return addMemberCommand;
		} else if (input_command.equals("MAKE_PARTNERS")) {
			return makePartnersCommand;
		} else if (input_command.equals("ADD_CHILD")) {
			return addChildCommand;
		} else if (input_command.equals("GET_RELATIONSHIP")) {
			return relativesFinder;
		} else {
			throw new UnsupportedOperationException("Invalid command!!");
		}
	}

}
