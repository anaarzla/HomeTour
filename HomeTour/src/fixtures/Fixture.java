package fixtures;

public abstract class Fixture {

	public String name;
	public String shortDescription;
	public String longDescription;
		// TODO Auto-generated constructor stub
		// This abstract class will be used as a base for anything that can be looked at
		// or interacted with.

	public Fixture(String name, String shortDescription, String longDescription) {
		//super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getshortDescription() {
		return shortDescription;
	}

	public void setshortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getlongDescription() {
		return longDescription;
	}

	public void setfLongDes(String longDescription) {
		this.longDescription = longDescription;
	}



}