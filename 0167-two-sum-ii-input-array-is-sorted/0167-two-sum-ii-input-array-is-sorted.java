import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      int i=0;
      int  j=nums.length-1;

      while (i<j) {
        int comp=nums[i]+nums[j];
        if (comp==target) {
            return new int[]{i+1,j+1};
        }
        else if (comp<target) {
            i++;
        }else{
            j--;
        }
      }

       
return new int[]{};
    }
}