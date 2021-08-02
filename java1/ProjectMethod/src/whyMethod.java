public class whyMethod {
	
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);

		System.out.println(text);
		System.out.println(text);
		System.out.println(text);
		
		//-----------------------------
		
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		return out;
	}
	
	public static void main(String[] args) {
		
		printTwoTimes("m","377");

		System.out.println(twoTimes("17","3"));
	}

}
