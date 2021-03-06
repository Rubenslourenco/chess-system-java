package boardgame;

//pe�as
public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	// opera��o abstrata
	public abstract boolean[][] possibleMoves();

	// esse metodo e pra saber se as posic�es s�o verdadeira
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];

	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for ( int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}