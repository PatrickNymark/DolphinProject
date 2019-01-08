package com.patricknymark;

import com.patricknymark.users.Member;

public class Application {

    public static void main(String[] args) {
        String[] strings = {"Crawl", "Butterfly", "Backstroke"};

        System.out.println(strings[0]);
        Member member1 = new Member("Patrick", "Nymark", "22872325", "pn@ctdenmark.dk", 17, true, strings);

        System.out.println(member1);
    }
}
