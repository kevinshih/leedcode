package leedcode;

/**
 * 
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * 意思是return 一個值 之外 程式裡面保留陣列nums是最後的結果
 * 
 * 
 * 
 * @author kevin.shih
 *
 */


public class removeDuplicates {
	public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
    public int removeDuplicates2(int[] nums) {
        int answer = 0;
        Map<Integer,Integer> number = new HashMap<>();
        int[] expectedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(number.get(nums[i])!=null && number.get(nums[i])!=nums[i]){
                number.put(nums[i],nums[i]);
                expectedNums[answer] = nums[i];
                answer++;
            }
                
            
        }
        return answer;
    }
}
