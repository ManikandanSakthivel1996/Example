package Poly;

public class ActionName extends Movie{
	public String findRating(int fightScene) {
		if (fightScene==2) {
			return "poor";
		}
		else if (fightScene==3) {
			return "average";
		}
		else if (fightScene==4) {
			return "okay";
		}
		else {
			return "good";
		}

	}

}
