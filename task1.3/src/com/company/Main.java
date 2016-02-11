package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner scn = new Scanner(System.in);
            if(scn.hasNextInt()){
            if(scn.nextInt()%2==0){
                System.out.println("Number is even!");
            }
            else System.out.println("Number is odd!");
        }
        else System.out.println("Error. Number, you've entered is not an integer");
    }
}


