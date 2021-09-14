package com.company;

public class Main {

    public static void main(String[] args) {
	// EXERCISE 4

        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";
/*
        Expression	Result
        yes == no || grade > amount     = true
        amount == 40.0 || 50.0          = true
        hiVal != loVal || loVal < 0     = true
        True || hello.length() > 0      = true
        hello.isEmpty() && yes          = false
        grade <= 100 && !false          = true
        !yes || no                      = false
        grade > 75 > amount             = true
        amount <= hiVal && amount >= loVal = true
        no && !no || yes && !yes        = false
*/
    //EXERCISE 5
/*     forventet:
        true
        true
        ping!
        pong!
*/
        boolean flag1 = isHoopy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);
        if (flag1 && flag2) {
            System.out.println("ping!");
        }
        if (flag1 || flag2) {
            System.out.println("pong!");
        }
    }
    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        if (x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
 /*
    OUTPUT:
    true
    true
    ping!
    pong!
  */
}
