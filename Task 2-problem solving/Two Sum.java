import java.util.Hashtable;

// using HashTable
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

// using Two Pointer
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int []ans = new int[2];

        int i = 0 , j = i+1;

        while(i<j) {
           if(nums[i]+nums[j]==target){
               ans[0] = i;
               ans[1] = j;
               break;
           } 
           else if(j==n-1) {
               i++;
               j = i+1;
           } 
           else  j++;
        }
        
        return ans;
    }
}