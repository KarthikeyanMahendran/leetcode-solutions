// Two Sum II - Input Array Is Sorted [Medium]
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0 ;
        int right = n-1;
        while(left < right ){
            int sum = nums[left]+ nums[right];
            if(sum == target) return new int[]{left+1,right+1};
            if (sum > target){
                right--;

            }
            else{
                left ++;
            }
            
            }

            return new int[]{};
        }

        
    }
