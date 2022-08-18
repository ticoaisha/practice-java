package com;

public class NearHundred {

    public static void main(String[] args) {
        System.out.println(nearHundred(238));
    }

    public static boolean nearHundred(int n) {

        if( Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return true;

        }else{
            return false;
        }
    }
}
