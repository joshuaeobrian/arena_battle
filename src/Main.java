import java.util.Scanner;

/**
 * Created by chrisaanerud on 3/10/17.
 */
public class Main {
    public static void main(String[] args){
        String input;
        String name;
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Battle Arena");
        input = read.next();
        Character player1 = new Character(50, input,"warrior");
        Character player2 = new Character(30,"Smiley","troll");
        Arena room = new Arena(player1, player2);
        room.fight();

    }


}



/// name
// pick type