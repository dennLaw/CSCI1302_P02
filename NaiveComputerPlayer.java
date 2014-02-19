public class NaiveComputerPlayer extends ComputerPlayer{

	int guessCount = 97;
	char guess = '';

	public NaiveComputerPlayer(){
		
	}

	public char playerInput(){
		if(!(guessCount == 122)){
			guess.charAt(guessCount);
			guessCount++;
		}
		else{
			guess.charAt(guessCount);
			guessCount = 97;
		}

		return guess;
	}
}
