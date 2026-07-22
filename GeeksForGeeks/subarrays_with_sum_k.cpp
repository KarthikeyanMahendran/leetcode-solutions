// Subarrays With Sum K [Medium]
// https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/

class Solution {
    public int cntSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for (int n : arr){
            prefixSum += n;
            int target = prefixSum - k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixSum , map.getOrDefault(prefixSum,0)+1);
        
    }
    return count;
}}