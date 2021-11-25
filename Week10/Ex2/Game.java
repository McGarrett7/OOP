package Week10.Ex2;

import java.util.ArrayList;

public class Game {
    private Board board;
    private static ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * a.
     * a.
     * a.
     * a.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move;
            if (board.getAt(x, y) != null) {
                move = new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece, board.getAt(x, y));
                board.removeAt(x, y);
            } else {
                move = new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            moveHistory.add(move);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public static ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

}