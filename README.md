# Assignment 1

## Question 1: (100%)

Let A be an array of integers (positive or negative). Assume that the array is of size n. The subarray A[i..j] is the part of the array that starts at index i and ends at index j, where 0 ≤ i ≤ j ≤ n-1. Let s<sub>ij</sub> equal the sum of the integers in A[i..j].

We wish to solve the following problem:

### Important: Find the maximum value for s<sub>ij</sub> over all subarrays <b>with a maximum length of 3 </b> in array A, where 0 ≤ i ≤ j ≤ n-1.

The three algorithms given below solve this problem. 
NOTE: If all of the values in the array are negative, then the maximum value for s<sub>ij</sub> is 0 by default.

Example: If the array contains the values { -1, 12, -3, 14, -4, 3 }, then the maximum sum over all subarrays is 23 (for the subarray {12, -3, 14}). If the array contains the values { 2, -3, 5, -1, 7}, then the maximum sum over all subarrays is 11 (for the subarray {5, -1, 7}).


### ALGORITHM 1
Start with a maximum sum of 0. Compute the sum of each 1-element subarray, then compute the sum of each 2-element subarray, then compute the sum of each 3-element subarray, etc. For each sum you compute, if it is larger than the maximum sum you've seen, then it becomes the maximum sum.

### ALGORITHM 2 
Start with a maximum sum of 0. Compute the sum of each subarray that starts at index 0, then compute the sum of each subarray that starts at index 1, then compute the sum of each subarray that starts at index 2, etc. For each sum you compute, if it is larger than the maximum sum you've seen, then it becomes the maximum sum.

EFFICIENCY NOTE: Once you compute the sum of the subarray from A[i] to A[j], the sum of the subarray from A[i] to A[j+1] is just the previous sum you computed plus A[j+1]. Don't add up all of the previous values all over again.

### ALGORITHM 3 (Optional)
Start with a maximum sum of 0. Compute the sum of all subarrays starting from index 0. Use the efficiency note from Algorithm 2. If the sum you compute is negative, start computing the sum of all subarrays starting from the next index in the array. Repeat this special rule if necessary. For each sum you compute, if it is larger than the maximum sum you've seen, then it becomes the maximum sum.

For example, as you compute the sum of all subarrays starting from index 0, if you find the sum of the integers in A[0..5] is negative, then compute the sum of all subarrays starting from index 6 next. If the sum of the integers from A[6..14] is negative, then compute the sum of all subarrays starting from index 15, Etc.

You are to write a Java program that determines the amount of work each of these algorithms does to compute its answer for arrays of various sizes. Using this data, you are to determine the runtime complexity of each algorithm.



## Assignment TODO

Fix the class MethodTester that contains a main method and three static helper methods, one to implement each algorithm above. Your main method should test your methods with small arrays (like the ones in the examples above) so you know they work correctly before moving on.

Once you know the algorithms work correctly, run the class named RuntimeAnalyzer that contains the methods to quantify the algorithms. 

The class measures the time that your computer spends processing the algorithm using:
```java
long startTime = System.currentTimeMillis( ); // record the starting time
 /* (run the algorithm) */
long endTime = System.currentTimeMillis( ); // record the ending time
long elapsed = endTime − startTime;
```
If your computer is too fast use:
```java
long startTime = System.nanoTime(); // record the starting time
 /* (run the algorithm) */
long endTime = System.nanoTime(); // record the ending time
long elapsed = endTime − startTime;
```
This class will run your algorithms for randomly generated arrays of size 5, 10, 15, ..., up to 50. For each array size,it will generate 20 arrays (one at a time) and run the algorithms with each array, averaging the returned number of assignment statements executed for each algorithm separately.

## Fix the method GenerateArray in RuntimeAnalyzer.java

Each array should have random values between -10 and 99, inclusive, and you can have duplicates. 
To generate a random number between x and y, use the following Java expression: 
```java
(int)(Math.random()*(y-x+1) + x) 
```

