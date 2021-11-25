package Week10.Ex2;

import java.util.Objects;

public class Rook extends Piece {

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (getCoordinatesX() != x && getCoordinatesY() != y) {
            return false;
        }
        if (getCoordinatesY() == y) {
            if (x >= getCoordinatesX()) {
                for (int i = getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
            }
        } else {
            if (y >= getCoordinatesY()) {
                for (int i = getCoordinatesY() + 1; i < y; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
            }
        }
        Piece pieceAt = board.getAt(x, y);
        return pieceAt == null
                || !Objects.equals(pieceAt.getColor(), getColor());
    }
}