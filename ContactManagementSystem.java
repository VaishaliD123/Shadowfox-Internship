package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

// <-- same package


public class ContactManagementSystem {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\nContact " + (i + 1) + ":");
                contacts.get(i).displayContact();
            }
        }
    }

    private static void updateContact() {
        System.out.print("Enter contact number to update: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume leftover newline

        if (index >= 0 && index < contacts.size()) {
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter new email: ");
            String email = scanner.nextLine();

            contacts.set(index, new Contact(name, phone, email));
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }

    private static void deleteContact() {
        System.out.print("Enter contact number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume leftover newline

        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Invalid contact number.");
        }
    }
}
