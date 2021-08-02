import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.7));
		System.out.println();
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("java");
		f1.close();

		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write("java");
		f2.close();
		
		

	}

}
