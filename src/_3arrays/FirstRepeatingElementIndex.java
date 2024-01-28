package _3arrays;

public class FirstRepeatingElementIndex {
	
	public static int firstRepeatingElementIndex(int arr[]) {
		
		int max = -1;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		//creating hash array
		int[] hash = new int[max+1];
		
		//Mapping/Counting occurrence of element
		for(int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;
		}
		

		int repeating = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; ++i) {
			if(hash[arr[i]] > 1) {
				repeating = i;
				break;
			}
		}
		
		if(repeating == Integer.MIN_VALUE) {
			return -1;
		}else {
			return repeating;
		}
		
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,5,3,2,5};
		
		int index = firstRepeatingElementIndex(arr);
		
		System.out.println("First Repeating index is : "+index);
	}

}
