package Poly;

public class Movie {
	public String findRating(int fightScene) {
		if (fightScene==2) {
			return "average";
		}
		else if (fightScene==3) {
			return "okay";
		}
		else if (fightScene==4) {
			return "good";
		}
		else {
			return "super";
		}
	}

}
