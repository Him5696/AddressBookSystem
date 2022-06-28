package com.blz.adressbook.ContactPerson;

import java.util.ArrayList;

import java.util.Scanner;

public class ContactPerson {
    String firstName;
    String lastName;
    String city;
    String state;
    String address;
    String emailId;
    long phoneNo;
    int zipCode;
    int count = 1;

    // Display User Details
    public void addressBook(ArrayList<ContactPerson> contactPerson) {
        for (int i = 0; i < contactPerson.size(); i++) {
            System.out.println("contact" + count);
            System.out.println("First Name: " + contactPerson.get(i).firstName);
            System.out.println("Last Name: " + contactPerson.get(i).lastName);
            System.out.println("Address: " + contactPerson.get(i).address);
            System.out.println("City Name : " + contactPerson.get(i).city);
            System.out.println("State Name : " + contactPerson.get(i).state);
            System.out.println("Email-Id : " + contactPerson.get(i).emailId);
            System.out.println("Zip Code : " + contactPerson.get(i).zipCode);
            System.out.println("phone Number : " + contactPerson.get(i).phoneNo);
            count++;
        }
    }

    //  Update the Contact Details
    public void updateData(String name, ArrayList<ContactPerson> contactDetails) {
        for (int i = 0; i < contactDetails.size(); i++) {
            if (name.equals(contactDetails.get(i).firstName)) {
                contactDetails.remove(i);
                contactDetails.add(i, getInput());
            }
        }
        System.out.println("Record Update Successfully.......");
    }

    // Creating function to get user Input

    public ContactPerson getInput() {
        ContactPerson addressBookMain = new ContactPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        addressBookMain.firstName = sc.next();

        System.out.print("Enter the Last Name : ");
        addressBookMain.lastName = sc.next();

        System.out.print("Enter the Address: ");
        addressBookMain.address = sc.next();
        addressBookMain.address += sc.nextLine();

        System.out.print("Enter the City Name : ");
        addressBookMain.city = sc.next();

        System.out.print("Enter the state Name : ");
        addressBookMain.state = sc.next();

        System.out.print("Enter the Email-Id : ");
        addressBookMain.emailId = sc.next();

        System.out.print("Enter the Zip Code : ");
        addressBookMain.zipCode = sc.nextInt();

        System.out.print("Enter the  Phone Number: ");
        addressBookMain.phoneNo = sc.nextLong();
        return addressBookMain;
    }
}
