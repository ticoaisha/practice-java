package com;

public class FindAbsoluteValue {

    public static void main(String[] args) {
        System.out.println(diff21(5));
    }

    public static int diff21(int n) {
        if(n<=21){
            return Math.abs(21 - n);
        }else{
            return 2 * Math.abs(21-n);
        }
    }
}
