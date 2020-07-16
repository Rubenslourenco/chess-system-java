package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

//peça de xadrez
public abstract class ChessPiece extends Piece {
	
	private Color color;
	
	// board repassa chamada para o construtor da superclass no caso Piece
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	

}
