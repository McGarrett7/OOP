package Week11;

import Week10.Ex2.Board;
import Week10.Ex2.Game;

public class Main {

    public static void main(String[] args) {
        Bishop r1 = new Bishop(2, 7, "white");
        Bishop r2 = new Bishop(6, 3, "black");

        Board board = new Board();
        board.addPiece(r1);
        board.addPiece(r2);

        Game game = new Game(board);

        System.out.println(r1.canMove(board, 1, 8));
        System.out.println(r2.canMove(board, 5, 2));

        game.movePiece(board.getAt(2,7), 3, 6);
        game.movePiece(board.getAt(6,3), 5, 4);

        System.out.println(game.getBoard().getAt(5,4).getColor());
        System.out.println(Game.getMoveHistory());
    }
}