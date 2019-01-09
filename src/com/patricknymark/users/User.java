package com.patricknymark.users;

public abstract class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private int age;
    private String password;
    private int userID;

    private static int id = 1000;

    // Constructor
    public User(String firstName, String lastName, String phoneNumber, String email, int age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.password = password;

        // Calling it here to generate the userID each time a class is created.
        generateID();
    }

    // Sets the userID as id + 1
    // id is static therefore belongs to the class it self and not the instances that we create with the new keyword.
    private void generateID() {
        this.userID = id++;
    }

    // GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    // SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
