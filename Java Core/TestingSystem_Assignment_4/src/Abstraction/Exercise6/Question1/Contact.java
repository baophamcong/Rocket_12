package Abstraction.Exercise6.Question1;

public class Contact {

	private String name;
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String phone) {
		super();
		this.phone = phone;
		this.name = name;
	}
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", name=" + name + "]";
	}

}
