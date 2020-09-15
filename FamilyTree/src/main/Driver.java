package main;

import java.util.ArrayList;

import command.Command;
import command.CommandFactory;
import command.LBCommandFactory;
import family.FamilyTree;
import family.LengaburuFamilyTree;
import people.LBFamilyMembersCreatorFactory;
import people.PeopleFactory;
import utils.FileReader;

public class Driver {

	public static void main(String[] args) {

		FamilyTree familyTree = new LengaburuFamilyTree();
		PeopleFactory peopleFactory = new LBFamilyMembersCreatorFactory();
		CommandFactory commandFactory = new LBCommandFactory(familyTree, peopleFactory);
		String absoluteFilePath = args[0];
		ArrayList<String> inputAsList = new ArrayList<String>();
		FileReader fileReader = new FileReader(absoluteFilePath);
		inputAsList = fileReader.readFile();
		for (String line : inputAsList) {
			String params[] = line.split(" ");
			String input_command = params[0];
			Command command = commandFactory.getCommand(input_command);
			command.execute(params);
		}
	}

}
