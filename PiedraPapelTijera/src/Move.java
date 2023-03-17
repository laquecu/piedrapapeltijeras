/**
 * Class that stores a move
 */
 
public class Move{

    private String move;

    public Move(){
    	this.move = null;
    }

    public Move(String move){
    	this.move = move;
    }

    public String getMove(){
	    return move;
    }

    public boolean isUnknown(){
	    return (move == null);
    }

    public int beats(Move other){
	    return MoveWords.checkWinner(this.move, other.getMove());
    }  
}
@startuml
class Game {
    -private Parser parser

    +Public Game()
    -private void welcome()
    -private void printHelp()
    -private Move computerMove()
    -private void printWinner(int who)
    -private void printMoves(Move player, Move computer)
    -private boolean processMove(Move move)
    +public void playGame()
    +public static void main(String[] args)

}
class Parser {

    -private MoveWords moves
    -private Scanner reader
    +public Parser()
    +public void showCommands()
    +public Move newRandomMove()
    +public Move getMove()
}

class MoveWords {
    +public static final int EMPATE
    +public static final int GANA
    +public static final int PIERDE
    -private static final String[] validMoves
    -private static final String[] validCommands
    -private Random rnd

    +public MoveWords()
    +public boolean isValidMoveCommand()
    +public String randomMove()
    +public void showMoves()
    +public void showCommands()
    +public void showWords()
    -private static int getIndex()
    -public static int checkWinner()

}
class Move {
    -private String move
    +public Move()
    +public Move(String move)
    +public String getMove()

    +public boolean isUnknown()

    +public int beats(Move other)
}

Game *-- Parser
Parser *-- MoveWords



class Move
@enduml
