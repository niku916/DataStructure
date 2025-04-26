public class Colleage {

	String colleageName;
	Colleage nextCollegeInfo;
	String name;

	public Colleage() {

	}

	public Colleage(String colleageName) {

		this.colleageName = colleageName;
		this.nextCollegeInfo = null;
	}

	public void addCollegeInfo(String colleageName) {
		Colleage colleague = this.traverse();
		Colleage addcolleage = new Colleage(colleageName);
		colleague.setNextCollegeInfo(addcolleage);
		addcolleage.setNextCollegeInfo(null);
	}

	public Colleage traverse() {
		Colleage currColleage = this;
		if (currColleage.nextCollegeInfo != null) {
			currColleage = this.nextCollegeInfo.traverse();
		}
		return currColleage;
	}

	public Colleage traverse(int index) {
		Colleage colleague = this;
		index--;
		if (index != 0 && this.nextCollegeInfo != null) {
			colleague = this.nextCollegeInfo.traverse(index);
		}
		return colleague;
	}

	public Colleage deleteByIndex(int index) {
		Colleage colleage = this;
		Colleage traverseColleage1 = this.traverse(index - 1);
		Colleage traverseColleage = this.traverse(index);
		traverseColleage1.setNextCollegeInfo(traverseColleage
				.getNextCollegeInfo());
		return colleage;
	}

	public Colleage insertByIndex(int index, String name) {
		Colleage colleage = this;
		Colleage traverseColleage = this.traverse(index+1);
		Colleage newColleage = new Colleage(name);
		newColleage.setNextCollegeInfo(traverseColleage.getNextCollegeInfo());
		traverseColleage.setNextCollegeInfo(newColleage);
		return colleage;
	}

	public Colleage contains(String name) {
		Colleage searchColleage = this;
		if (this.colleageName != name) {
			searchColleage = this.nextCollegeInfo.contains(name);
		}
		return searchColleage;
	}

	public Colleage deleteIndex(int index) {
		Colleage deletedColleage = null;
		Colleage previousColleague = this.traverse(index - 1);
		deletedColleage = previousColleague.getNextCollegeInfo();
		if (deletedColleage != null) {
			previousColleague.setNextCollegeInfo(deletedColleage
					.getNextCollegeInfo());
		}
		return deletedColleage;
	}

	/* this */
	public int size() {
		int index = 0;
		try {
			index = 1 + this.nextCollegeInfo.size();
		} catch (NullPointerException n) {
			index = 0;
		}

		return index;
	}

	public boolean isequals(Colleage colleage) {
		if (this.colleageName != colleage.colleageName) {
			return false;
		}

		if (this.nextCollegeInfo == null) {
			return colleage.nextCollegeInfo == null;
		}

		return this.nextCollegeInfo.isequals(colleage.nextCollegeInfo);
	}

	public static void main(String[] args) {
		Colleage colleage = new Colleage();
		System.out.println(colleage.size());
		colleage.addCollegeInfo(null);
		colleage.addCollegeInfo(null);
		colleage.addCollegeInfo(null);
		System.out.println(colleage.size());
		colleage.addCollegeInfo("SHASHWAT");
		colleage.addCollegeInfo("VIVEK");
		colleage.addCollegeInfo("VIVEK2");
		colleage.addCollegeInfo("VIVEK3");
		colleage.addCollegeInfo("VIVEK4");
		colleage.addCollegeInfo("VIVEK5");
		/*
		 * System.out.println(colleage); Colleage deleteByIndex =
		 * colleage.deleteByIndex(3); System.out.println(deleteByIndex);
		 * Colleage deleteIndex = colleage.deleteIndex(3);
		 * System.out.println(deleteIndex); System.out.println(colleage);
		 */
		// System.out.println(colleage.size());
		// System.out.println(colleage.contains("VIVEK2"));
		Colleage colleage2 = new Colleage();
		// System.out.println(colleage2.size());
		colleage2.addCollegeInfo("Vinit");
		colleage2.addCollegeInfo(null);
		colleage2.addCollegeInfo(null);
		// System.out.println(colleage.size());
		colleage2.addCollegeInfo("SHASHWAT");
		colleage2.addCollegeInfo("VIVEK");
		colleage2.addCollegeInfo("VIVEK2");
		colleage2.addCollegeInfo("VIVEK3");
		colleage2.addCollegeInfo("VIVEK4");
		colleage2.addCollegeInfo("VIVEK5");
		boolean equals = colleage2.isequals(colleage);
		System.out.println(colleage2.insertByIndex(0, "kshdfjh"));
	}

//	@Override
//	public String toString() {
//		String stringName = "";
//		if (this.nextCollegeInfo != null) {
//			stringName = this.nextCollegeInfo.toString();
//		}
//		return this.colleageName
//				+ ((!stringName.equals("")) ? ("," + stringName) : stringName);
//	}
	

	private String getColleageName() {
		return colleageName;
	}

	@Override
	public String toString() {
		return "Colleage [colleageName=" + colleageName + ", nextCollegeInfo="
				+ nextCollegeInfo + ", name=" + name + "]";
	}

	private void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}

	private Colleage getNextCollegeInfo() {
		return nextCollegeInfo;
	}

	private void setNextCollegeInfo(Colleage nextCollegeInfo) {
		this.nextCollegeInfo = nextCollegeInfo;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

}
