package Abstraction.Exercise6.Question1;

import java.util.ArrayList;

public abstract class Phone {

	public static ArrayList<Contact> contacts;

	public Phone() {
		contacts = new ArrayList<Contact>();
	}

	public abstract void insertContact(String name, String phone);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, String newPhone);

	public abstract void searchContact(String name);
	
	public abstract void hienThiThongTin();

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}

}