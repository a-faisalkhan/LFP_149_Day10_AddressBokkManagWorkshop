package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome to Address Book Management System");

		System.out.println("1. Add Contact");
		System.out.println("2. Edit Contact");
		System.out.println("3. Delete Contact");
		System.out.println("4. Search Contact");
		System.out.println("5. Exit");
		System.out.println("Enter your desired option:");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		while (option != 5) {
			switch (option) {
			case 1:
				addressBook.addContact();
				break;
			case 2: 
				addressBook.editContact();
				break;
			case 3: 
				addressBook.deleteContact();
				break;	
			case 4: 
				addressBook.searchContact();
				break;
			case 5:
				option = 5;
				break;
			default:
				System.out.println("Enter valid option from the list");
				break;
			}
			
			System.out.println("1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search Contact");
			System.out.println("5. Exit");
			System.out.println("Enter your desired option:");
			
		    option = sc.nextInt();
		}

		//sc.close();
	}
}
