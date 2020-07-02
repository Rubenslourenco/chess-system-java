package chess;

import boardgame.Board;
import boardgame.Piece;

//peça de xadrez
public class ChessPiece extends Piece {
	
	private Color color;
	
	// board repassa chamada para o construtor da superclass no caso Piece
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
