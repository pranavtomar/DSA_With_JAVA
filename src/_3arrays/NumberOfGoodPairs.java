package _3arrays;
import java.util.HashMap;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		int n = numIdenticalPairs(nums);
		System.out.println(n);
	}
	
	public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int friend: nums){
            var friendCount = hm.getOrDefault(friend,0);
            ans += friendCount;
            hm.put(friend, friendCount+1);
        }
        return ans;
    }

}
