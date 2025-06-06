package boardgame;

public abstract class Piece {

	protected Position position;
	private final Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		int length = mat.length;
        for (boolean[] booleans : mat) {
            for (int j = 0; j < length; j++) {
                if (booleans[j]) {
                    return true;
                }
            }
        }
		return false;
	}
}
