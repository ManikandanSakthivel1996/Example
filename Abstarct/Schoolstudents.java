package Abstarct;

public class Schoolstudents implements Student {
	public String findName(String name) {
	return name;
	}
	public String findFees(int fees) {
		if(fees>200000) {
			return "cbsc syllabus";
		}
		else if(fees<200000) {
			return "matric Syllabus";
		}
		else {
			return "government Syllabus";
		}
	}

}
