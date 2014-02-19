public class HumanPlayer extends Player{

	Scanner scan = new Scanner(System.in);
	String input = "";

	public HumanPlayer(){
		
	}
	
	public char playerInput(){
		input = scan.nextLine();

		if(input.length() > 1 || input.length() == 0){
			return '1';
		}
		else{
			return input.charAt(0);
		}
	}
}
