package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	//Inicialmente s� vamos passar o board pq
	//a posi��o de um piece recem criado deve ser null
	//dizendo que piece n�o foi colocado no board ainda
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
   
	//Tiramos o m�todo setBoard pois n�o vamos 
	//permitir que board seja alterado
	//e o m�todo getBoard ser� protected pois
	//queremos que somente classes do mesmo pacote
	//e subclasses poderao acessar o board de um piece
	
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	//isso aqui � chamado de hook methods, ie, � um m�todo que faz um gancho com a sub classe
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
				
			}
			
		}
		return false;
	}
	
	
	

}
