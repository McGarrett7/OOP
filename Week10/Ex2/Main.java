package Week10.Ex2;

public class Main {

    public static void main(String[] args) {
        Piece r1 = new Rook(4, 2, "white");
        Rook r2 = new Rook(7, 3, "black");
        Rook r3 = new Rook(7, 1, "black");

        Board board = new Board();
        board.addPiece(r1);
        board.addPiece(r2);
        board.addPiece(r3);

        System.out.println(r3.canMove(board, 7, 3));

        Game game = new Game(board);
        game.movePiece(board.getAt(4,2), 8, 2);
        game.movePiece(board.getAt(7,3), 8, 3);

        System.out.println(game.getBoard().getAt(8,2).getColor());
        System.out.println(Game.getMoveHistory());
    }
}