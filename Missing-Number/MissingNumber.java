class Solution {

    public int missingNumber(int[] nums) {
    
    // stroring the maximum number in the array 
    int maximumNumber = nums[0]; 

    // loop to find the maximum number in the array 
    for (int i = 0; i < nums.length; i++){

        // check to see if current number is greater than maximumNumber
        if(nums[i] > maximumNumber){

            // then update maximum number
            maximumNumber = nums[i];
        }
    }

    //looping from 0 to maximum number (my range) and checking if number exists in the array 

    for (int i = 0; i <= maximumNumber; i++){

        // flag to keep track of matches in the array 
        boolean found = false;

        for (int j = 0; j < nums.length; j++){

            // check if current number matches i 
            if(nums[j] == i){

                // if found return true and the break out of j loop
                found = true; 
                break; 
            }
        }

        // if the nmumber isn't found in the array retrun it 
        if(!found){
            return  i; 
        }
  

    }

    // if all numbers were present 0 to max then add one to max 
          return maximumNumber + 1;
}
}


// we have an array of unique numbers 

// loop through the array and find the maximum number 

// store it in a variable called maximumNumber

// loop through 0 and the maximum number 

// for each number i in the range

// i want to initialize a flag setting it to true 

// then create an inner loop to compare each i to the number in numbers in the array. 

// if found to be true, break the loop and set the flag to true 

// after the inner loop, if found false, return i, this is the missing number

// if all numbers from 0 to maximumNumber are found 

// return max number + 1
//
