class Solution {
    public int[] sortedSquares(int[] nums) {

    // initializing a new array to store the squared numbers
      int[] newArray = new int[nums.length];

      // for loop to square each integer in the array
        for(int i = 0; i < nums.length; i++){

            // square each integer in the array 
            int squaredNumber = nums[i] * nums[i]; 

            // saving each squared number in the array 
            newArray[i] = squaredNumber; 

        }

        // sort the new array of squared numbers 
        Arrays.sort(newArray);

        // returning the sorted array 
        return newArray;


        
    }
}


// we have an array of integers in increasing order 

// square each integer in the array by looping and getting each integer 

// create a new array with a fixed size 

// add each squared integer inside the array 

// sort the new array in increaing order -> lowest no. to highes no. using the sort method

// return the array 
