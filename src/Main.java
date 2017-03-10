/**
 * Created by chrisaanerud on 3/10/17.
 */
public class Main {
    public static void main(String[] args){
Character player1 = new Character(50, "Balrog","warrior");
Character player2 = new Character(30,"Smiley","troll");
    Arena room = new Arena(player1, player2);
    room.fight();

    }

}
