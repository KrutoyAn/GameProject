package com.gameproject.git;

import java.util.Scanner;

public class FindNum {
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Your task is to guess the number");
        for(int i = 10; i <= 30; i+=10) playLevel(i);
        console.close();

    }
    private static void playLevel(int range){
        int randnum = (int) (Math.random() * range);
        while (true){
            System.out.println(" Find the number from 0 to " + range);
            int input_number = console.nextInt();

            if(input_number == randnum){
                System.out.println("WIN");
                break;
            } else if(input_number > randnum){
                System.out.println("The hidden number is less");
            }else {
                System.out.println("The hidden number is greater");
            }
        }
    }
}
