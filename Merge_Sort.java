//Given an array of integers, nums,sort the array in non-decreasing order using the merge sort algorithm. Return the sorted array.
//A sorted array in non-decreasing order is one in which each element is either greater than or equal to all the elements to its left in the array.

import java.util.List;

public class Merge_Sort {
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        mergeSortHelper(nums , 0 , n-1);

        return nums;
    }
    public void mergeSortHelper(int[] nums , int low , int high){
        if(low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSortHelper(nums , low , mid);
        mergeSortHelper(nums , mid + 1 , high);

        merge(nums , low , mid , high);
    }
    public void merge(int[] nums , int low , int mid , int high){
        List<Integer> temp = new java.util.ArrayList<>();
        int  left = low ;
        int right = mid+1;
        while (left <= mid && right<=high) {
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
            
        }
        while (left<= mid) {
            temp.add(nums[left]);
            left++;

            
        }
        while (right<=mid) {
            temp.add(nums[right]);
            right++;
            
        }
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i-low);
        }
    }
    
}
