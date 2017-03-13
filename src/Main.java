import java.util.Scanner;

/**
 * Created by chrisaanerud on 3/10/17.
 */
public class Main {
    public static void main(String[] args){
        PrintFormat printer = new PrintFormat();
        int count=0;
        String input;
        String name;
        Scanner read = new Scanner(System.in);
        printer.print("Welcome to the Battle Arena!");
        printer.print("To begin the battle, enter you warrior name:");
        name = read.next();
        System.out.println("Pick a number to choose your character class.");
        for(String character: CharacterType.getCharacterTypes()){
            count++;
            System.out.printf("\t\t%s. %s%n",count,character);
        }
        System.out.print("\nChoice: ");
        input = read.next();
        if(input.equals("1")){
            input = CharacterType.getCharacterType(0);
        }else if(input.equals("2")){
            input = CharacterType.getCharacterType(1);
        }else if(input.equals("3")){
            input = CharacterType.getCharacterType(2);
        }else if(input.equals("4")){
            input = CharacterType.getCharacterType(3);
        }else if(input.equals("5")){
            input = CharacterType.getCharacterType(4);
        }else{
            input = CharacterType.getCharacterType(5);
        }
        Character player1 = new Character(50, name,input);
        Character player2 = new Character(30,
                CharacterType.getEnemyName(),CharacterType.geyEnemyType());
        printer.print(String.format("Welcome %s the %s!%n",player1.getCharacterName(),player1.getCharacterType()));
        printer.print(String.format("You are about to battle %s the %s",player2.getCharacterName(),player2.getCharacterType()));
        while(true) {
            if(player1.isAlive()&&player2.isAlive()) {
                printer.print("Are you ready to battle? y/n");
                input = read.next();
                if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")) {
                    Arena room = new Arena(player1, player2);
                    room.fight();
                } else if (input.toLowerCase().equals("n") || input.toLowerCase().equals("no")) {
                    break;
                } else {
                    System.out.println("Sorry, Invalid input try again...");
                }
            }else{
                if (player1.isAlive() && !player2.isAlive()) {
                    printer.print("You are Victorious!");
                    break;
                } else{
                    printer.print("You have been defeated!");
                    break;
                }
            }
        }


    }


}



/// name
// pick type