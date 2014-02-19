import java.io.*;
import java.util.*;

public class Hangman{

	public static void main(String args[]){
	
		String playerArg;
		String compArg;
		boolean compPlayer;
		boolean flag = false;
		int argsCount = 0;
		boolean trig1 = false;
		boolean trig2 = false;
		
		
		for(int i = 0; i < args.length; i++){
			if(!trig1 && args[i].equalsIgnoreCase("human")){
				playerArg = arg[i];
				compPlayer = false;
				argsCount++;
			}
			else if(!trig1 && args[i].equalsIgnoreCase("naive") || args[i].equalsIgnoreCase("random") || args[i].equalsIgnoreCase("cutthroat")){
				playerArg = arg[i];
				compPlayer = true;
				argsCount++;
			}
			else if(!trig2 && args[i].equalsIgnoreCase("computer")){
				compArg = args[i];
				argsCount++;
			}
			else if(args[i].equalsIgnoreCase("-l"){
				flag = true;
			}
		}

		if(argsCount == 2){

		}
	}
}
