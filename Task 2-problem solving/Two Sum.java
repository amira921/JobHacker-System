import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable <>();
        
        for(int i=0;i< nums.length;i++){
            if(hashtable.containsKey(target - nums[i])){
                int [] indices = {hashtable.get(target - nums[i]),i};
                return indices;
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}