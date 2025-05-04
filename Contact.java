package com.contacts;

class Contact {
    String name;
    String phone;
    String email;

    // Constructor
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Display contact details
    public void displayContact() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
    }
}

