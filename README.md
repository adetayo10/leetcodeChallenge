# LeetCode Team Challenge

Leetcode Problems Team 2 - Cohort 7

Welcome to Team 2, Cohort 7 Leetcode challenge Repo. We teamed up to solve a series of LeetCode problems together, focusing on clear communication, collaborative problem-solving, and clean code. Here’s an overview of how we approached each task, our thought process, and the solutions we came up with.

# **📌Challenge Overview**
### Problems Solved:

1. Average Salary Excluding the Minimum and Maximum Salary

2. Squares of a Sorted Array

3. Missing Number

4. Add Two Numbers

5. Merge Two Sorted Lists

*We worked through each challenge as a team, regularly syncing up on Slack and committing our progress to this GitHub repo. Below, you’ll find our explanations, pseudocode, and how we approached each solution.*

# 📌Problem Approaches & Reasoning

## **1. Average Salary Excluding the Minimum and Maximum**

**Reasoning:**
We’re given an array of unique salary integers. The goal is to find the average salary excluding the highest and lowest values. Since the numbers are unique, we don’t have to worry about multiple entries with the same value.
The average should be calculated based on the remaining values once the smallest and largest salaries are removed.

**🟢Approach:**
1. Initialize min, max, and sum with the first value in the array.

2. Loop through the array to find the actual minimum and maximum salaries.

3. Loop again to calculate the sum of all salaries excluding the min and max.

4. Divide the filtered sum by (salary.length - 2) to get the average.


## **2. Squares of a Sorted Array**

**Reasoning:**
We’re given a sorted array in non-decreasing order, but it may contain negative numbers. When we square these values, negative numbers become positive and may disrupt the sorted order. So even though the input is sorted, the squared version might not be.

**🟢Approach:**
1. Initialize a new array of the same size.

2. Loop through the input array and square each element.

3. Store each squared value in the new array.

4. Sort the new array using the built-in Arrays.sort() method.

5. Return the sorted array of squares.


## **3. Missing Number**

**Reasoning:**
We’re given an array containing n distinct numbers taken from 0 to n. Since one number is missing from this sequence, we need to identify which one is not present.
The idea is to iterate from 0 to the maximum number in the array and check if each number is present. If not, that's the missing number.

**🟢Approach:**
1. Loop through the array to determine the maximum value.

2. Iterate from 0 to that max value.

3. For each number i, loop through the array to check if it exists.

4. If not found, return i as the missing number.

5. If all numbers from 0 to max are present, return max + 1.


## **4. Missing NumbeAdd Two Numbers**

**Reasoning:**
We’re asked to simulate the addition of two numbers represented by two linked lists in reverse order. Each node contains a single digit. The task is to return a new linked list representing the sum.
We need to add corresponding nodes while keeping track of any carry that results from the addition.

**🟢Approach:**
1. Create a dummy node to act as the head of the result list.

2. Use a pointer to build the result list from the placeholder node.

3. Loop through both linked lists while at least one still has a node or carry is non-zero.

4. Add the values from both nodes or 0 if null and include the carry.

5. Create a new node with the digit sum % 10 and update the carry sum / 10.

6. Return dummy.next as the head of the result list.

## **5. Merge Two Sorted Lists**

**Reasoning:**
We’re given two sorted linked lists, and we need to merge them into one sorted linked list. Since both input lists are already sorted, we can build the merged list by comparing the current values of each and appending the smaller one.

**🟢Approach:**
1. Create a dummy node to simplify pointer operations.

2. Use a current pointer to track the tail of the new list.

3. While both lists are not null:

4. Compare values.

5. Attach the smaller node to current.next.

6. Move the pointer of the list that had the smaller value.

7. After the loop, if either list still has nodes left, attach them to the end of the merged list.

8. Return placeHolder.next as the head of the new list.
