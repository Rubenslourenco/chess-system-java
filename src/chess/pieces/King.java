package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
//class rei
public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "K";//essa k vai entra no tabuleiro como uma piece
	}

}
