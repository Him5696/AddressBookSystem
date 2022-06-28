package com.blz.adressbook;

import com.blz.adressbook.ContactPerson.ContactPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ContactPerson contactPerson = new ContactPerson();
        ArrayList<ContactPerson> contactDetails = new ArrayList<>();
        String name;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int userChoice = 1;
        // User Choose the Option
        while (flag) {
            System.out.print(" 1 - Add more contact \n2 - Edit Contact \n3 - Show AddressBook " + "\n0 - for exist \n Enter your choice: ");
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    contactDetails.add(contactPerson.getInput());
                    break;
                case 2:
                    System.out.println("Enter first name that you want to edit contactDetails");
                    name = sc.next();
                    contactPerson.updateData(name, contactDetails);
                    break;
                case 3:
                    System.out.println("contactDetails : " + contactDetails.size());
                    contactPerson.addressBook(contactDetails);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
