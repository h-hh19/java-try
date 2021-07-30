
public class AuthApp3 {

	public static void main(String[] args) {
		
		String[][] users = 
			{
				{"KDY", "317"},
				{"3F","38"},
				{"3M", "377"}
				
			};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		for(int i = 0; i < users.length; i ++) {
			
			String[] current = users[i]; 
			boolean ispassId = current[0].equals(inputId);
			boolean ispassword = current[1].equals(inputPass);
			if(ispassId && ispassword) {
				System.out.println(current[0] + " hi.");
			}
		}
	
	
	}

}
