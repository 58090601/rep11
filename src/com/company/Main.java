package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ip-адрес:");
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String input = ip;
        boolean result = input.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");
        if (result) {
            System.out.println("ОК");
        } else {
            System.out.println("ОШИБКА");
        }
    }
}      