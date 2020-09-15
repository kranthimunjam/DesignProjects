package people;

import java.util.ArrayList;

public interface PersonInterface {
	
	String getName();
	
	Gender getGender();
	
	String getMother();
	
	void setFather(String father);

	String getFather();
	
	String getPartner();
	
	ArrayList<String> getChildren();
	
	void addChild(String child);

	void addPartner(String partner);
}
