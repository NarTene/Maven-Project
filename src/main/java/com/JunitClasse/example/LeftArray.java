package com.JunitClasse.example;

public class LeftArray {

    /*

  Given an array of ints length 3,
  return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
  rotateLeft3([1, 2, 3]) → [2, 3, 1]
  rotateLeft3([5, 11, 9]) → [11, 9, 5]
  rotateLeft3([7, 0, 0]) → [0, 0, 7]
   */

    public int[] arr_rotateLeft(int[] nums) {

        int[] arrayAsData = {nums[1], nums[2], nums[0]};

        return arrayAsData;

    }

   /* public int[] rotateLeft( int[] nums){
        int n=3;
        for (int i=0; i<= nums.length-1; i++){
            int temp = nums[0];
            //for(int j =1; j<= nums.length-1 )
        }

        return nums;
    }*/
}
