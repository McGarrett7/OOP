package Week11;

import Week10.Ex2.Board;
import Week10.Ex2.Piece;

import java.util.Objects;

public class Bishop extends Piece {

    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (Math.abs(getCoordinatesX() - x) != Math.abs(getCoordinatesY() - y)) {
            return false;
        }
        int n = (getCoordinatesY() - y) / (getCoordinatesX() - x);
        if (y > getCoordinatesY() && x < getCoordinatesX()) {
            for (int i = x + 1; i < y; i++) {
                if (board.getAt(i, n * i + (y - n * x)) != null) {
                    return false;
                }
            }
        }
        Piece pieceAt = board.getAt(x, y);
        return pieceAt == null
                || !Objects.equals(pieceAt.getColor(), getColor());
    }
}