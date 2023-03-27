package Abstarct;

public class UseStoryBook {
	public static void main(String[] args) {
		StoryBook sb = new StoryBook();
		System.out.println(sb.publicationYear(2023));
		System.out.println(sb.displayAuthor("woods"));
		System.out.println(sb.displayPrice(100));
		
	}

}
