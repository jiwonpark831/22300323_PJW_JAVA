package week7;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.J035();
    }

    void J031() {
        String userid;
        String password;
        String name;
        Scanner in = new Scanner(System.in);
        userid = in.nextLine();
        password = in.nextLine();
        name = in.nextLine();

        if (password.length() < 3) {
            System.out.println("Error! password is too short!");
        } else {
            System.out.println("User ID: " + userid);
            String printpw = "";
            printpw = password.substring(0, 2);
            String printpw2 = "";
            for (int i = 0; i < (password.length() - 2); i++) {
                printpw2 += '*';
            }
            System.out.println("Password: " + printpw + printpw2);
            System.out.println("User Name: " + name);
        }
    }

    /*
     * void pract() {
     * String str = "0123456";
     * str.substring(2, 6);
     * // 2~6번째 출력
     * 
     * String today = "2024-04-19";
     * String[] arrayToday = today.split("-");
     * for (int i = 0; i < arrayToday.length; i++) {
     * System.out.println(i + " : " + arrayToday[i]);
     * }
     * String todayNum = today.replaceAll("-", "");
     * int todayNumber = Integer.parseInt(todayNum);
     * String str1 = "1";
     * // int => Integer // 후자는 class여서 대문자
     * 
     * if (str1.equals("1")) {
     * 
     * }
     * if ("1".equals(str1)) {
     * 
     * }
     * // "1"이 안정성이 담보되어야 하는데 그런 측면에서 완벽한(?) 후자가 더 안정성이 높다
     * String str2 = "12345";
     * if (str2.contains("3")) {
     * }
     * }
     */

    void J032() {
        String str;
        String reverse = "";
        Scanner in = new Scanner(System.in);
        StringBuilder reverseBuilder = new StringBuilder();
        str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int reverse_i = str.length() - 1 - i;
            reverse += str.charAt(reverse_i);
            reverseBuilder.append(str.charAt(reverse_i));
        }
        System.out.println(reverse);
    }

    void J033() {
        int count;
        String name;
        String longest = "";
        String shortest = "";
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        in.nextLine();

        for (int i = 0; i < count; i++) {
            name = in.nextLine();
            if (i == 0) {
                longest = name;
                shortest = name;
            } else {
                if (longest.length() < name.length())
                    longest = name;
                if (shortest.length() > name.length())
                    shortest = name;
            }
        }
        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);
    }

    void J034() {
        String[] usernames = { "kim", "lee", "park", "hong", "choi" };
        String[] passwords = { "1111", "1234", "3456", "3535", "7777" };
        String username;
        String password;
        Scanner in = new Scanner(System.in);
        username = in.nextLine();
        password = in.nextLine();

        for (int i = 0; i < usernames.length; i++)
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                System.out.println("Login OK!");
                System.exit(0);
            } else if (usernames[i].equals(username) && !passwords[i].equals(password)) {
                System.out.println("Incorrect password!");
                System.exit(0);
            }
        System.out.println("No user!");
    }

    void J035() {
        String bday;
        Scanner in = new Scanner(System.in);
        bday = in.nextLine();

        int year1 = Integer.parseInt(bday.substring(0, 1));
        int year2 = Integer.parseInt(bday.substring(1, 2));
        int year3 = Integer.parseInt(bday.substring(2, 3));
        int year4 = Integer.parseInt(bday.substring(3, 4));
        int month = Integer.parseInt(bday.substring(4, 6));
        int day = Integer.parseInt(bday.substring(6, 8));
        int sum = year1 + year2 + year3 + year4 + month + day;

        System.out.println(sum);
    }

}