package loop2HomeWork;

public class PrintEven {
	public static void main(String[] args) {
		int count = 0;
		int count1 = 0;
		String[] n = args[0].split(","); 
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);
		int c = Integer.parseInt(n[2]);
		int d = Integer.parseInt(n[3]);
		int e = Integer.parseInt(n[4]);
		int f = Integer.parseInt(n[5]);
		int[] nums = {a,b,c,d,e,f};
		for(int i=0;i<nums.length;i++) {
		if(nums[i]%2==0) {
			System.out.println(nums[i]);
		}
		else if(nums[i]%2!=0) {
			System.out.println(nums[i]);
		}
		}
	}

}
