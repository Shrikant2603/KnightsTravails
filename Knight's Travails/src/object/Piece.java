package object;

import java.util.LinkedList;


public abstract class Piece {
	
	protected enum Type {
		PAWN, QUEEN, KING, ROCK, KNIGHT, BISHOP;
	}
	
	protected Type type;
	protected Square position;
	
	/**
	 * A constructor class piece to create a chess set with a given position
	 * @param position
	 */
	public Piece(Square position) {
		this.position = position;
	}
	
	/**
	 * An abstract method of each valid moves of a chess set
	 * @param square
	 * @return a list move by type square
	 */
	public abstract LinkedList<Square> validMove(Square square);
}
