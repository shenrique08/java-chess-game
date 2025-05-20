package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position pos) {
        return possibleMoves()[position.getRow()][position.getCol()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] matrix = possibleMoves();

        for (boolean[] booleans : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (booleans[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
