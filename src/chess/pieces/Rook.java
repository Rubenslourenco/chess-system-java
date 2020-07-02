package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
// class torre
public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "R"; //essa r vai entra no tabuleiro como uma piece
	}
	

}
