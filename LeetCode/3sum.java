// 3Sum [Medium]
// https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0 ; i<n -2; i++){
            if(i>0 && nums[i]== nums[i-1]) continue;

            int j = i+1 ;
            int k = n -1;
            while (j< k){

                if (nums[i]+ nums[j]+ nums[k]==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]== nums[j+1]) j++;
                    while(j<k && nums[k]== nums[k-1]) k--;
                }
                if(nums[i]+ nums[j]+ nums[k] > 0) k--;
                else{
                    j++;

                }
            }


        }
        return res;
    }
}