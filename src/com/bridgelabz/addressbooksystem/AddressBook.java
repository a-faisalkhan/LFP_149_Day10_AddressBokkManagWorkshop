package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
	public void showAddressBook() {

	}

	public void addContact() {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();

		System.out.println("Enter Person Details: ");

		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		contact.setFirstName(firstName);

		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		contact.setLastName(lastName);

		System.out.println("Enter Phone Number: ");
		long phoneNumber = sc.nextLong();
		contact.setPhoneNumber(phoneNumber);

		System.out.println("Enter Email Id: ");
		String emailId = sc.next();
		contact.setEmailId(emailId);

		System.out.println("Enter City: ");
		String city = sc.next();
		contact.setCity(city);

		System.out.println("Enter State: ");
		String state = sc.next();
		contact.setState(state);

		System.out.println("Enter Zip: ");
		long zip = sc.nextInt();
		contact.setZip(zip);

		System.out.println("Contact added details are: ");

		//list.add(contact);

		System.out.println("New added contact details are: ");
		
		  System.out.println("FirstName:" + contact.getFirstName() + "\t" + "LastName:"
		  + contact.getLastName() + "\t" + "PhoneNumber:" + contact.getPhoneNumber() +
		  "\t" + "Email Id:" + contact.getEmailId() + "\t" + "City:" +
		  contact.getCity() + "\t" + "State:" + contact.getState() + "\t" + "Zip:" +
		  contact.getZip());
		 
		//System.out.println(contact);
		//sc.close();
	}

	public void deleteContact() {
		// TODO Auto-generated method stub
		
	}

	public void editContact() {
		// TODO Auto-generated method stub
		
	}
}
