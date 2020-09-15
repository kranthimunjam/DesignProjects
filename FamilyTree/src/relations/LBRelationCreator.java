package relations;

public class LBRelationCreator implements RelationsCreator {

	@Override
	public Relation createRelation(String relationName) {
		if (relationName.equals("Siblings")) {
			return new Siblings();
		}
		else if (relationName.equals("Paternal-Uncle")) {
			return new PaternalUncle();
		}
		else if (relationName.equals("Maternal-Uncle")) {
			return new MaternalUncle();
		}
		else if (relationName.equals("Paternal-Aunt")) {
			return new PaternalAunt();
		}
		else if (relationName.equals("Maternal-Aunt")) {
			return new MaternalAunt();
		} else if (relationName.equals("Sister-In-Law")) {
			return new SisterInLaw();
		} else if (relationName.equals("Brother-In-Law")) {
			return new BrotherInLaw();
		} else if (relationName.equals("Son")) {
			return new Son();
		} else if (relationName.equals("Daughter")) {
			return new Daughter();
		}
		return null;
	}

}
