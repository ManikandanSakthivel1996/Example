
package Abstarct;

public class StoryBook implements Book {
	public String displayPrice(int price) {
	return "price "+ price;
}
	public String displayAuthor(String author) {
		return "adam"+author;
	}
	public String publicationYear(int year) {
		return "year "+year;
	}
}
