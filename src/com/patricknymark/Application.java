package com.patricknymark;


import com.patricknymark.database.CoachDB;
import com.patricknymark.database.Database;
import com.patricknymark.database.ManagerDB;
import com.patricknymark.database.MemberDB;
import com.patricknymark.users.Coach;
import com.patricknymark.users.Manager;
import com.patricknymark.users.Member;
import com.patricknymark.users.User;
import com.patricknymark.views.AccountingView;
import com.patricknymark.views.ManagerView;
import com.patricknymark.views.MemberView;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Database database = new Database();
        ManagerView managerView = new ManagerView();
        AccountingView accountingView = new AccountingView();
        MemberView memberView = new MemberView();

        Coach coach1 = new Coach("P", "p", "p", "p", 24, "pass");
        Member member1 = new Member("P", "p", "p", "p", 24, "pass", coach1 , new ArrayList<>());
        Member member2 = new Member("P", "p", "p", "p", 24, "pass", new ArrayList<>());
        Manager manager = new Manager("Manager", "m", "22", "m", 20, "pass");

        MemberDB.addMember(member1);
        CoachDB.addCoach(coach1);
        ManagerDB.addManager(manager);

        User currentUser = null;

        while(currentUser == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter login type: ");
            System.out.println("1 - Manager");
            System.out.println("2 - Coach");
            System.out.println("3 - Member");
            System.out.println("4 - Accounting");
            int option = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter email: ");
            String email = scanner.nextLine();
            System.out.println("Please enter password: ");
            String password = scanner.nextLine();

            switch (option) {
                case 1:
                    currentUser = managerLogin(email, password);
                    break;
                case 2:
                    currentUser = coachLogin(email, password);
                    break;
                case 3:
                    currentUser = memberLogin(email, password);
                    break;
            }
        }

        if(currentUser.getClass().equals(Manager.class)) {
            managerView.run();
        } else if(currentUser.getClass().equals(Member.class)) {
            memberView.run();
        }

    }


    private static Manager managerLogin(String email, String password) {
        for(Manager manager : Database.getManagers()) {
            if(manager.getEmail().equals(email) && manager.getPassword().equals(password)) {
                return manager;
            }
        }

        return null;
    }

    private static Member memberLogin(String email, String password) {
        for(Member member : Database.getMembers()) {
            if(member.getEmail().equals(email) && member.getPassword().equals(password)) {
                return member;
            }
        }

        return null;
    }

    private static Coach coachLogin(String email, String password) {
        for(Coach coach : Database.getCoaches()) {
            if(coach.getEmail().equals(email) && coach.getPassword().equals(password)) {
                return coach;
            }
        }

        return null;
    }

}
