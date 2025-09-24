
public class Exp4_2 {

	public static void main(String[] args) {
		int[] nums = {12,45,3,67,22,90,15};
		int max = nums[0];
		
		for(int num : nums) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("最大値は" + max +"です。");
	}

}
