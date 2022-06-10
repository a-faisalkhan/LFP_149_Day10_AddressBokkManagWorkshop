package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {

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

		System.out.println("New added contact details are: ");

		System.out.println("FirstName: " + contact.getFirstName() + "\t" + "LastName: " + contact.getLastName() + "\t"
				+ "PhoneNumber: " + contact.getPhoneNumber() + "\t" + "Email Id: " + contact.getEmailId() + "\t"
				+ "City: " + contact.getCity() + "\t" + "State: " + contact.getState() + "\t" + "Zip: "
				+ contact.getZip());

		// sc.close();
	}

	public void searchContact() {
		// TODO Auto-generated method stub

	}

	public void deleteContact() {
		System.out.println("Enter the name to search and delete");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

	}

	public void editContact() {
		System.out.println("Enter person name for edit contact: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();

	}

}
