package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] fdgdfh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入字母：");

        char i=sc.next().charAt(0);

        if(i>=97&&i<=122){

            System.out.println(i+"為小寫。");

            char I=(char)(i-32);

            System.out.println(i+"的大寫為"+I);

        }else if(i>=65&&i<=90){

            System.out.println(i+"為大寫。");
            char I=(char)(i-32);

            System.out.println(i+"的小寫為"+I);

        }

    }

}