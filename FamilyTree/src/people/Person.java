package people;

import java.util.ArrayList;

public class Person implements PersonInterface {
	private Gender gender;
	private String name;
	private String mother;
	private String father;
	private String partner;
	private ArrayList<String> children = new ArrayList<String>();
	
	public Person(String name, String motherName, Gender gender) {
		this.name = name;
		this.mother = motherName;
		this.gender = gender;

	}
	
	public String getName() {
		return name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getMother() {
		return mother;
	}

	public void setFather(String father) {
		this.father = father;
	}
	
	public String getFather() {
		return father;
	}

	public String getPartner() {
		return partner;
	}
	
	public ArrayList<String> getChildren() {
		return children;
	}
	
	public void addChild(String child) {
		this.children.add(child);
		System.out.println("CHILD_ADDITION_SUCCEEDED");

	}

	@Override
	public void addPartner(String partner) {
		this.partner = partner;
		System.out.println("PARTNER_ADDITION_SUCCEEDED");

	}

}
