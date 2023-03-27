package comCondition.day5;

public class OR {
	public static void main(String[] args) {
		String mailID = "manikandan2014@gmail.com";
		if(mailID.endsWith("@gmail.com")||mailID.endsWith("@yahoo.com")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
