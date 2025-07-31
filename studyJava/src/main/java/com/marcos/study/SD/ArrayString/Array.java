package com.marcos.study.sd.arraystring;

import java.util.Arrays;


public class Array{

    public void declaring(){

        int[] numberss;
        int numbers[];
    }

    public void creating(){
        
        int[] numbers = new int[5];         //  array of 5 integers (default 0)
        String[] names = new String[5];     //   array of 3 string (default null)
    }

    public void initializing(){

        int[] nums = {1,2,3,4};
        String[] names = {"Marcos", "Junior"};
    }

    public void accessingElements(){

        int[] nums = {1,2,3};

        int first = nums[0];    //get first element
        nums[1] = 10;           //set second element to 10
    }

    public void length(){
        int[] nums = new int[3];

        int len = nums.length;   // noparentheses
    }

    public void looping(){

        int[] nums = new int[4];

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }


        // Enhanced for-each loop
        for(int num: nums){
            System.out.println(num);
        }
    }

    public void copying(){

        int[] original = {1,2,3};
        int[] copy = Arrays.copyOf(original, original.length);
    }

    public void sorting (){

        int[] nums = {1,4,3,4};
        Arrays.sort(nums);
    }

    public void comparing(int[] arr1, int[] arr2){

        boolean isEqual = Arrays.equals(arr1, arr2);
    }

    public void convertingToString(){

        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(nums));
    }

}