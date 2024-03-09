/*100221. Maximum Number of Operations With the Same Score I

Difficulty:Easy
Given an array of integers called nums, you can perform the following operation while nums contains at least 2 elements:

Choose the first two elements of nums and delete them.
The score of the operation is the sum of the deleted elements.

Your task is to find the maximum number of operations that can be performed, such that all operations have the same score.

Return the maximum number of operations possible that satisfy the condition mentioned above.
Example 1:
Input: nums = [3,2,1,4,5]
Output: 2
Explanation: We perform the following operations:
- Delete the first two elements, with score 3 + 2 = 5, nums = [1,4,5].
- Delete the first two elements, with score 1 + 4 = 5, nums = [5].
We are unable to perform any more operations as nums contain only 1 element*/

import java.util.*;
class day1{
    public static int maxOperations(int[] arr){
        int sum= arr[0]+arr[1];
        int i=2;
        int j=arr.length-1;
        int count=1;
        while(i<j){
            if(arr[i]+arr[i+1]==sum){
                count++;
            }
            else{
                break;
            }
            i+=2;

        }
        return count;
    }
    public static void main(String[] args){
    
        int arr[]= {3,2,1,4,5};
        System.out.println(maxOperations(arr));


    }

}
