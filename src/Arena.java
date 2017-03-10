/**
 * Created by chrisaanerud on 3/10/17.
 */
/*
/* constructor containing two args: each character is an argument; boolean to check if the arena is empty
check health in the arena
 */

public class Arena {


     // 2 private propertie of characters
    private Character character1;
    private Character character2;

    // private boolean for area

    private boolean isArenaEmpty;

     public Arena(Character character1, Character character2){
         //set properties
         this.character1 = character1;
         this.character2 = character2;


     }

     // non returning method that for attacking and adjusting heath fight()

    public void fight(){
         // while  ||
         while(character1.isAlive() && character2.isAlive()){
             character1.attackEnemy(character2);
             character2.attackEnemy(character1);
         }
         //battle is over


    }
     //checkCharacterStatus() return true or false


     //isArenaEmpty() return true or false

}

