package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;
// class torre
public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "B"; //essa r vai entra no tabuleiro como uma pe�a
	}
	
	//movimentos possiveis de um torre
		@Override
		public boolean[][] possibleMoves() {
			boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
			
			Position p = new Position(0, 0);
			
			//Noroeste
			p.setValues(position.getRow() -1, position.getColumn() - 1 );
			//se a posi��o acima da passa for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() -1 , p.getColumn() - 1); //linha vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Nordeste
			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			//se a posi��o esquerda da pe�a for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() -1 , p.getColumn() + 1); //coluna vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Sudeste
			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			//se a posi��o direita da pe�a for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() +1 , p.getColumn() + 1); //coluna vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Sudoeste
			p.setValues(position.getRow() +1, position.getColumn() - 1);
			//se a posi��o abaixo da passa for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() + 1 , p.getColumn() - 1); //linha vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			
			
			return mat;
		}
	

}