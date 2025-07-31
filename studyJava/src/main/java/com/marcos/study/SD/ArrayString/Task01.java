package com.marcos.study.sd.arraystring;

/**
 * Dado uma entrada de uma array, devo tirar os elementos repetidos
 */

import java.util.Arrays;

public class Task01{

    public void removeArray(int[] array){


        int[] temp = new int[array.length];
        int newSize = 0;

        for(int i = 0; i < array.length; i++){
            boolean isDuplicate = false;

            for(int j = 0; j < newSize; j++){
                if (array[i] == temp[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                temp[newSize++] = array[i];
            }
        }

        int[] uniqueArray = Arrays.copyOf(temp, newSize);
        System.out.println(Arrays.toString(uniqueArray));

    }
}