package application;

import chess.ChessMatch;

public class Program {
	
	public static void main (String[] agrs) {
	
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());//imprimindo as pe�a da partida
		
		
	}

}
