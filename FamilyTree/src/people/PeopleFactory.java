package people;

public interface PeopleFactory {
	PersonInterface createPerson(String name, String motherName, Gender gender);
}
