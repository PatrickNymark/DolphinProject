package com.patricknymark.views;

import com.patricknymark.database.Database;
import com.patricknymark.users.Manager;
import com.patricknymark.users.Member;

import java.util.Scanner;

public class ManagerView {
    private boolean quit = false;


    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(!quit) {
            System.out.println("Welcome ");
            System.out.println("Please enter option: ");
            String option = scanner.nextLine();

            if(option.equalsIgnoreCase("Q")) {
                quit = true;
            }


        }
    }


    public void printMembers() {
        for(Member member : Database.getMembers()) {
            System.out.println("Member={" +
                    "First Name: " + member.getFirstName() +
                    "| Last Name: " + member.getLastName() +
                    "| Phone Number: " + member.getPhoneNumber() +
                    "| Email: " + member.getEmail() +
                    "| isElite: " + member.isElite() +
                    "| isActive: " + member.isActive() +
                    "| isSenior: " + member.isSenior() +
                    "| Coach: " + member.getCoach().getUserID());
        }
    }
}
