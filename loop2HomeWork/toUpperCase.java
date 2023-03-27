package loop2HomeWork;

public class toUpperCase {
	public static void main(String[] args) {
		String[] str = args[0].split("@");
		String a = str[0];
		String b = str[1];
		String c = str[2];
		String d = str[3];
		String[] values = {a,b,c,d};
		for(int i=0;i<values.length;i++) {
			if(values[i].equals(values[i].toUpperCase())) {
				System.out.println(values[i]);
			}
		}
	}

}
