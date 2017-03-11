import java.util.*;

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
    private Map weapons = new HashMap();
    private List<String> keys;
    private Scanner read = new Scanner(System.in);



    // private boolean for area

    private boolean isArenaEmpty;

     public Arena(Character character1, Character character2){
         //set properties
         this.character1 = character1;
         this.character2 = character2;
         weapons.put("Axe",75);
         weapons.put("Spear",50);
         weapons.put("Frying Pan", 25);
         weapons.put("Morning star", 100);
         weapons.put("Sword",125);
         weapons.put("Club",35);
         keys = new ArrayList<>(weapons.keySet());

     }

     // non returning method that for attacking and adjusting heath fight()

    public void fight(){
         // while  ||

         while(character1.isAlive() && character2.isAlive()){

             if(foundWeapon()){

             }else {
                 character1.attackEnemy(character2);
             }
             if(foundWeapon()){

             }else {
                 character2.attackEnemy(character1);
             }
         }
         if(character1.isAlive()){
             System.out.println(character1.getCharacterName()+" is alive");
         }else{
             System.out.println(character2.getCharacterName()+" is alive");
         }


    }
    private boolean foundWeapon(){
        Random random = new Random();

        if((random.nextInt(1 + 10)%9)==1){
            return true;
        }else{
            return false;
        }
    }
    public void chooseWeapon(){
        int listCount = 1;
        System.out.println("\nYou tripped on a pile of weapons would you like to pick one up?");
        for(String weapon:keys){
            System.out.println(listCount+ ". "+weapon);
            listCount++;
        }
        int input = Integer.parseInt(read.next());

    }

     //checkCharacterStatus() return true or false


     //isArenaEmpty() return true or false

}

