// Subarray Sum Equals K [Medium]
// https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int prefixSum =0;
        int count =0;
        map.put(0,1);
        for (int r =0; r<n;r++){
            prefixSum += arr[r];
            int t = prefixSum - k;
            if(map.containsKey(t)){
                count += map.get(t);

            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
            

        }
        return count;
        
    }
}