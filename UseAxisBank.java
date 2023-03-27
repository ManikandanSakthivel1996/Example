
public class UseAxisBank {
	public static void main(String[] args) {
		int principleAmount = 1500000;
		int interestpercentage = 5;
		int age = 45;
		AxisBank a = new AxisBank();
		System.out.println(a.checkLocker(principleAmount)+","+a.loanEligibility(age)+","+a.getinterest(principleAmount, interestpercentage));
	}

}
class AxisBank extends Rbibank{
	public String checkLocker(int principleAmount) {
		return "available"+principleAmount;
	}
	public String loanEligibility(int age) {
		if(age>45) {
			return "not";
		}
		else {
		return "eligible";
	}
	}
	
}
abstract class Rbibank {
	public String getinterest(int principleAmount,int interestPercentage) {
		int getinterest = principleAmount*interestPercentage/100;
		return  "value"+getinterest;
	}
	public abstract String loanEligibility(int age);
}
