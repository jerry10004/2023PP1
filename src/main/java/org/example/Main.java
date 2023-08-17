package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner s = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = s.next();
        System.out.println(name + "님 반갑습니다! ");

    }
}