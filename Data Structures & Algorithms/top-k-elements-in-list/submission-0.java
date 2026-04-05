class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            int maxKey=-1;
            int maxFreq=-1;
            for(int key:freq.keySet()){
                if(freq.get(key)>maxFreq){
                    maxFreq=freq.get(key);
                    maxKey=key;
                }
            }
            result[i]=maxKey;
            freq.remove(maxKey);
        }
        return result;
    }
}
