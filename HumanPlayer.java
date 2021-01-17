package edu.brandeis.cs12b.pa2;

import edu.brandeis.cs12b.pa2.provided.GameOf15;

public class HumanPlayer {

	public static void main(String[] args) {
		HumanPlayer hp = new HumanPlayer();

		GameOf15 game = new GameOf15();
		hp.play(game);
	}
	
	/**
	 * Here, you must implement a command-line interface to the 15-puzzle game.
	 * 
	 * You should ask the user for moves and execute them on the provided board
	 * until the puzzle has been solved. The move commands are:
	 * 
	 * u -- move up
	 * d -- move down
	 * l -- move left (that's an L, not an I)
	 * r -- move right
	 * exit -- exit the game
	 * 
	 * Your prompt line should be the following:
	 * "Enter a move: (l)eft, (u)p, (r)ight, (d)own, or (exit): "
	 * 
	 * Invalid input line should be the following:
	 * "Invalid input. Try again."
	 * 
	 * If the move cannot be performed, you should warn:
	 * "*No move was made. Try again."
	 * 
	 * @param args
	 */
	public void play(GameOf15 game) {
		//TODO implement me
		
	}
}
