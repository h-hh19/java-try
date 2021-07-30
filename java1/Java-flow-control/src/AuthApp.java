
public class AuthApp {

	public static void main(String[] args) {
		
		String inputId = args[0];
		String id = "DaeYoung";
		
		String inputPass = args[1];
		String pass = "317";
		String pass2 = "377";
		
		System.out.println("Hi.");
		
		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
		
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master!");
	}else {
		System.out.println("Who are you?");
	}

}
}
