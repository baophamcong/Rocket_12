package Abstraction.Exercise6.Question1;

import java.util.Scanner;



public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		contacts.add(contact);

	}
	@Override
	public void hienThiThongTin() {

		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}

	@Override
	public void removeContact(String name) {
		int i;
	for(i=0; i< contacts.size(); i++) {
		if(name.equals(contacts.get(i).getName())) {
			contacts.remove(i);
			i--;
			for(i=0; i< contacts.size(); i++) {
				
				System.out.println(contacts);
			}}
		}
	}
	

	@Override
	public void updateContact(String name, String newPhone) {
		int i;
		for(i=0; i< contacts.size(); i++) {
	if(name.equals(contacts.get(i).getName())) {
		Contact contact = new Contact(name, newPhone);
//		contacts.remove(i);
		
		contacts.clear();
		contacts.add(contact);
//		i--;
		for(i=0; i< contacts.size(); i++) {
			
			System.out.println(contact);
		}
	}
	
	}
	}
	@Override
	public void searchContact(String name) {
		for(Contact contact: contacts) {
			
			if(name.equals(contact.getName())) {
				System.out.println(contact);
			}
		}
		
	}

}
