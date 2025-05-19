package boardgame;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new BoardException("Invalid board length");
        }
        this.rows = rows;
        this.cols = cols;
        pieces = new Piece[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Piece getPiece(int row, int col) {
        if (!positionIsValid(row, col)) {
            throw new BoardException("Invalid position");
        }
        return pieces[row][col];
    }


    public Piece getPiece(Position position) {
        if (!positionIsValid(position)) {
            throw new BoardException("Invalid position");
        }
        return pieces[position.getRow()][position.getCol()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsPiece(position)) {
            throw new BoardException("There is already a piece in position " + position);
        }
        pieces[position.getRow()][position.getCol()] = piece;
        piece.position = position;

    }

    private boolean positionIsValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public boolean positionIsValid(Position position) {
        return positionIsValid(position.getRow(), position.getCol());
    }

    public boolean thereIsPiece(Position position) {
        if (!positionIsValid(position)) {
            throw new BoardException("Invalid position");
        }
        return getPiece(position) != null;
    }
}
