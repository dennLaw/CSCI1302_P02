public class RandomComputerPlayer extends ComputerPlayer{
	
	char guess = '';
	char[] guessedArray;
	boolean notSame = false;

	public RandomComputerPlayer(){

	}

	public char playerInput(String guessed){
		
		while(!notSame){
			guess.charAt((int)(Math.random() * 25) + 97);

			notSame = true;

			for(int i = 0; i < guessed.length(); i++){
				if(guess.equals(guessed.charAt(i))){
					notSame = false;
				}
			}
		}

		return guess;
	}
}

