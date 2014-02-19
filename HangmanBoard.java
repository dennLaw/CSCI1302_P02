public class HangmanBoard extends Board{

	char[] charList;

	public HangmanBoard(String word){
		charList = new char[word.length()];

		for(int i = 0; i < word.length(); i++){
			charList[i] = word.charAt(i);
		}
	}

	public char getChar(int indexOfLetter){
		return charList[indexOfLetter];
	}
}

