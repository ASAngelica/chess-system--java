package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	//Inicialmente só vamos passar o board pq
	//a posição de um piece recem criado deve ser null
	//dizendo que piece não foi colocado no board ainda
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
   
	//Tiramos o método setBoard pois não vamos 
	//permitir que board seja alterado
	//e o método getBoard será protected pois
	//queremos que somente classes do mesmo pacote
	//e subclasses poderao acessar o board de um piece
	
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	//isso aqui é chamado de hook methods, ie, é um método que faz um gancho com a sub classe
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
