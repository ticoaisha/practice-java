package com;

import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {
        System.out.println(appendNumbers(new int[] {12,90,7} ));

        int num = 12345;
        ArrayList<Integer> array = new ArrayList<>();
        do{
            array.add(0,num % 10);
            num /= 10;
        } while  (num > 0);

        System.out.println("This is an array : "+ array);

    }

    public static Integer appendNumbers(int[] nums){

//        String temp = "";
//        for(int i = 0; i <  nums.length; i++){
//            temp += nums[i];
//        }
//        return Integer.parseInt(temp);

        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = temp + nums[i];
            temp = temp * 10;
        }
        return temp/10;
    }
}
