package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("무엇을 하시겠습니까?\n\n0 = 가계부 등록, 1 = 가계부 리스트, 2 = 가계부 종료");
        } while (scan.nextInt() != 2);

        System.out.println("가계부가 종료되었습니다!");

    }
}
