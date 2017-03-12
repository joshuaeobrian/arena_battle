import java.util.Scanner;

/**
 * Created by chrisaanerud on 3/10/17.
 */
public class Main {
    public static void main(String[] args){
        PrintFormat printer = new PrintFormat();

        String input;
        String name;
        Scanner read = new Scanner(System.in);
        printer.print("Welcome to the Battle Arena!");
        printer.print("To start a battle Please enter you Fighting name:");
        input = read.next();
        Character player1 = new Character(50, input,"warrior");
        Character player2 = new Character(30,
                CharacterType.getEnemyName(),CharacterType.geyEnemyType());
        printer.print(String.format("You are about to battle %s the %s",player2.getCharacterName(),player2));
        Arena room = new Arena(player1, player2);
        room.fight();

    }


}



/// name
// pick type