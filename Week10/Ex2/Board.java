package Week10.Ex2;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
    }

    public boolean validate(int x, int y) {
        return (1 <= x && x <= 8) && (1 <= y && y <= 8);
    }

    /**
     * a.
     * a.
     * a.
     */
    public void addPiece(Piece piece) {
        if (checkPiece(piece)) {
            pieces.add(piece);
        }
    }

    /**
     * a.
     * a.
     * a.
     */
    public Piece getAt(int x, int y) {
        for (Piece i : pieces) {
            if (i.getCoordinatesX() == x
                    && i.getCoordinatesY() == y) {
                return i;
            }
        }
        return null;
    }

    /**
     * a.
     * a.
     * a.
     */
    public void removeAt(int x, int y) {
        for (Piece i : pieces) {
            if (i.getCoordinatesX() == x
                    && i.getCoordinatesY() == y) {
                pieces.remove(i);
                return;
            }
        }
    }

    /**
     * a.
     * a.
     * a.
     */
    public boolean checkPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return false;
        }
        for (Piece i : pieces) {
            if (i.getCoordinatesX() == piece.getCoordinatesX()
                    && i.getCoordinatesY() == piece.getCoordinatesY()) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}