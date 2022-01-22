package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//Inicialmente s� vamos passar o board pq
	//a posi��o de um piece recem criado ser null
	//dizendo que piece n�o foi colocado no board ainda
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
   
	//Tiramos o m�todo setBoard pois n�o vamos 
	//permitir que board seja alterado
	//e o m�todo getBoard ser� protected pois
	//queremos que somente classes do mesmo pacote
	//e subclasses v�o poder acessar o board de um piece
	
	
	protected Board getBoard() {
		return board;
	}

}
