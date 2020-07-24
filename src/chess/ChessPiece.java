package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

//peça de xadrez
public abstract class ChessPiece extends Piece {
	
	private Color color;
	private int moveCount;// mover contagem
	
	// board repassa chamada para o construtor da superclass no caso Piece
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	// aumentar contagem de movimentos
	 public void increaseMoveCount() {
		 moveCount++;
	 }
	 
	 //diminuir a contagem do movimento
	 public void decreaseMoveCount() {
		 moveCount--;
	 }
	
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	

}
