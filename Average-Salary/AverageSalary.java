class Solution {

    public double average(int[] salary) {
        
        // keeping track of the minimum, maximum and sum in a variable
        // we will need to initalize the maximum and minimum number with the first element in the array 
        int maxNumber = salary[0];
        int minNumber = salary[0];
        int sum = 0; 

        // looping through the salary array and updating the minimum and maximum numbers
        for(int i = 0; i < salary.length; i++){

        // if current salary is greater than maximum number then update 
        if(salary[i] > maxNumber){

           maxNumber =  salary[i];

        // if current salary is lesser than minimum number then update 
        } else if (salary[i] < minNumber){

           minNumber = salary[i];
        }

        }

        // looping through the salary array again 
       for(int i = 0; i < salary.length; i++){

        // filter the salary based on the max and minimum number
        if(salary[i] != maxNumber && salary[i] != minNumber){

            // adding the numbers in the sum variable
            sum += salary[i];
        }

       }
       
       // calculating the average based off the sum and the number of items in the array - 2 (we removed the minimum and maximum)
        double average = sum / (salary.length - 2); 

        // return  salary 
        return average; 
    }
}

// we have an array of salary 

// the array has unique integers 

// create variable to track minimum and maximum values and also the sum 

// find the minimun and maximum value in the array by looping

// loop again and filter out minimum and maximum number

// add the numbers upp into the sum varaible

// based on the size of the array -2 and the sum, calculate the average

// return the average
