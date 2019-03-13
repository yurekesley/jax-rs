package br.com.yurekesley.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import br.com.yurekesley.model.Contact;


@Named
public class ContactService {

	public List<Contact> getAll() {
		
		List<Contact> contacts = new ArrayList<Contact>();

		contacts.add(new Contact(1, "Yure", 26));
		contacts.add(new Contact(2, "Kesley", 35));
		contacts.add(new Contact(3, "Moreira", 47));
		contacts.add(new Contact(4, "Plácido", 50));

		return contacts;
	}
	
	public Contact getById(Integer id) {
		
		Contact contact = null;

		
		List<Contact> contacts = this.getAll();

		for (Contact c : contacts) {
			if (c.getId().equals(id)) {
				contact = c;
				break;
			}
		}
		
		return contact;
	}

}
