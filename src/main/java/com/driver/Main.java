package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RWOnly obj=new RWOnly();

        // 'name' has private access in 'com.driver.RWOnly'
        obj.setName(sc.nextLine());
        System.out.println(obj.getName());
    }
}