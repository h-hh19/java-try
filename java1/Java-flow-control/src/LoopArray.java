
public class LoopArray {

	public static void main(String[] args) {
		String [] users = new String[3];
		users[0] = "kimDaeYoung";
		users[1] = "goooooood";
		users[2] = "hairarte";
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}

	}

}
