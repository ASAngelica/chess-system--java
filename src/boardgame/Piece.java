package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//Inicialmente só vamos passar o board pq
	//a posição de um piece recem criado ser null
	//dizendo que piece não foi colocado no board ainda
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
   
	//Tiramos o método setBoard pois não vamos 
	//permitir que board seja alterado
	//e o método getBoard será protected pois
	//queremos que somente classes do mesmo pacote
	//e subclasses vão poder acessar o board de um piece
	
	
	protected Board getBoard() {
		return board;
	}

}
