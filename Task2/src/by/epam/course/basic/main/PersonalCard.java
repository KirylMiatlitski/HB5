package by.epam.course.basic.main;

public class PersonalCard {
	private String name;
	private String number;
	private String birthday;
	
	public PersonalCard(String name, String number, String birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public String getBirthday() {
		return birthday;
	}
	
	public void showCardInfo()
	{
		System.out.println("Card Info:");
		System.out.println("Name: "+this.getName());
		System.out.println("Phone Number: "+this.getNumber());
		System.out.println("Birth Day: "+this.getBirthday());
	}
	
}
