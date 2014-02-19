public class CutThroatComputerPlayer extends ComputerPlayer{

	HangmanAI whatACheat = new HangmanAI();	

	public CutThroatComputerPlayer(){

	}

	public char playerInput(String in_word, String guessed){
		return whatACheat.makeGuess(in_word, guessed);
	}
}
