package com.ohgiraffers.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            int num = sc.nextInt();
            boolean check = false;


            if(num <= 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            } else {
                for(int i = 2; i < num; i++) {
                    if(num % i == 0) {
                        check = false;
                        break;
                    }
                }
                System.out.println(check ? "소수다." : "소수가 아니다.");
                break;
            }

        }
    }

}