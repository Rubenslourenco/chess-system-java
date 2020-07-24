package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;
// class torre
public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "Q"; //essa r vai entra no tabuleiro como uma peça
	}
	
	//movimentos possiveis de um torre
		@Override
		public boolean[][] possibleMoves() {
			boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
			
			Position p = new Position(0, 0);
			
			//acima
			p.setValues(position.getRow() -1, position.getColumn());
			//se a posição acima da passa for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setRow(p.getRow() -1); //linha vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//esquerda
			p.setValues(position.getRow(), position.getColumn() -1);
			//se a posição esquerda da peça for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setColumn(p.getColumn() -1); //coluna vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//direita
			p.setValues(position.getRow(), position.getColumn() +1);
			//se a posição direita da peça for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setColumn(p.getColumn() +1); //coluna vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//abaixo
			p.setValues(position.getRow() +1, position.getColumn());
			//se a posição abaixo da passa for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setRow(p.getRow() +1); //linha vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Noroeste
			p.setValues(position.getRow() -1, position.getColumn() - 1 );
			//se a posição acima da passa for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() -1 , p.getColumn() - 1); //linha vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Nordeste
			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			//se a posição esquerda da peça for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() -1 , p.getColumn() + 1); //coluna vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Sudeste
			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			//se a posição direita da peça for vaga vai marca como vardadeiro e andar uma casa
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { 
				mat[p.getRow()][p.getColumn()] = true;
				p.setValues(p.getRow() +1 , p.getColumn() + 1); //coluna vai andar
			}
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			//Sudoeste
			p.setValues(position.getRow() +1, position.getColumn() - 1);
			//se a posição abaixo da passa for vaga vai marca como vardadeiro e andar uma casa
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
