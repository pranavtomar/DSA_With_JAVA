package _3arrays;
import java.util.HashMap;
import java.util.Arrays;

public class SmallerNumberThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,1,2,2,3};
		int[] smallerNumberThanCurrentArr = smallerNumberThanCurrent(nums);
		System.out.println(Arrays.toString(smallerNumberThanCurrentArr));
	}
	
	public static int[] smallerNumberThanCurrent(int[] nums) {
		HashMap<Integer,Integer> ms = new HashMap<>();
        int[] ans = new int[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        //[1,2,2,3,8]
        for(int i=0;i<copy.length;i++){
            if(!ms.containsKey(copy[i])) {
            	ms.put(copy[i],i);
            }
            //(1,0)
            //(2,1)
            //(3,3)
            //(8,4)
            
        }
        for(int i=0;i<nums.length;i++){
            ans[i] = ms.get(nums[i]);
        }
        return ans;
	}

}
