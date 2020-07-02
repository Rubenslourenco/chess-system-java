package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//class partida de xadrez
public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		//na classe ClessMatch tenho que dizer que o board e 8 por 8 
		board = new Board(8,8);
		initialSetup();//chamando o metodo inicio de partida
	}
	
	//retornando a matriz de pieces
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	//metodo responsavel por iniciar a partida de xadrez
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
		
		
	}

}
