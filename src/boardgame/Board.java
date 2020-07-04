package boardgame;
//class tabuleiro
public class Board {
	
	private int rows;//linhas
	private int columns;//colunas
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: trere must be at least 1 row and 1 column ");
		}                          //Erro criando tabuleiro: e necessario que tenha pelo menos 1 linha e 1 coluna
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row,int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");//posiçao nao existe no tabuleiro
		}
		return pieces[row][column];
	}
	//sobrecarga do metodo piece
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");//posiçao nao existe no tabuleiro
		}
		return pieces[position.getRow()][position.getColumn()];
	}
		
	
	//Colocar uma Piece em uma Positon
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There isredy a piece on a position on position" + position);//
		}
		pieces[position.getRow()][position.getColumn()] = piece;//pegando a matriz na posiçao dada e atribuir  que eu informe no caso piece
		piece.position = position;//piece nao esta mais na posição null esta na posição que informe no metodo
	}
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");//posiçao nao existe no tabuleiro
		} 
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
		
	}

	//funçaõ desse metodo ver se posicao existe
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");//posiçao fora do  tabuleiro
		}
		return piece(position) != null;
	}
	
	
	

}
