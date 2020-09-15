package people;

public class LBFamilyMembersCreatorFactory implements PeopleFactory {

	public LBFamilyMembersCreatorFactory() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Person createPerson(String name, String motherName, Gender gender) {
		return new Person(name, motherName, gender);
	}

}
