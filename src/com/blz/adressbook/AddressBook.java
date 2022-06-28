package com.blz.adressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static String firstName;
    static String lastName;
    static String city;
    static String state;
    static String address;
    static String emailId;
    static long phoneNo;
    static int zipCode;
    ArrayList<AddressBook> contactDetails=new ArrayList<>();
    String userWish = "yes";
    int count = 1;
    private static void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        firstName = sc.next();

        System.out.print("Enter the Last Name : ");
        lastName = sc.next();

        System.out.print("Enter the Address: ");
        address = sc.next();
        address += sc.nextLine();

        System.out.print("Enter the City Name : ");
        city = sc.next();

        System.out.print("Enter the state Name : ");
        state = sc.next();

        System.out.print("Enter the Email-Id : ");
        emailId = sc.next();

        System.out.print("Enter the Zip Code : ");
        zipCode = sc.nextInt();

        System.out.print("Enter the  Phone Number: ");
        phoneNo = sc.nextLong();
    }
    private void displayDetails(AddressBook display){
        System.out.println("contact" + count);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City Name : " + city);
        System.out.println("State Name : " + state);
        System.out.println("Email-Id : " + emailId);
        System.out.println("Zip Code : " + zipCode);
        System.out.println("phone Number  : " + phoneNo);
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBookMain = new AddressBook();
        Scanner userInput = new Scanner(System.in);
        while(addressBookMain.userWish.matches("yes")) {
            addressBookMain.getInput();
            addressBookMain.contactDetails.add(addressBookMain);
            System.out.println("IF YOU WANT TO ADD NEW RECORD PLEASE INSERT " + "yes " + "OR else " + "no");
            addressBookMain.userWish = userInput.next();
            if (addressBookMain.userWish == "no")
            {
                break;
            }
        }
        for (int i = 0; i < addressBookMain.contactDetails.size(); i++) {
            addressBookMain.displayDetails(addressBookMain.contactDetails.get(i));
        }
    }
}
