class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(freq.containsKey(needed)){
                return new int[] {freq.get(needed),i};
            }
            freq.put(nums[i],i);
        }
        return new int[] {};
    }
}
