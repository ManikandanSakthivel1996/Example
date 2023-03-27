package comCondition.day5;

public class OR1 {
	public static void main(String[] args) {
		int num = 15;
		//if (num%3==0 && num%5==0) {
		if(num%2==0 && num%5==0) {
			System.out.println(num+ "divisible by both");
		}
		else {
			System.out.println(num+ "it is not divisible");
		}
	}
}
