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
    private PrintFormat printer = new PrintFormat();
    private Random random = new Random();



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
         weapons.put("9mm",200);
         keys = new ArrayList<>(weapons.keySet());

     }

     // non returning method that for attacking and adjusting heath fight()

    public void fight(){
         // while  ||

         while(character1.isAlive() && character2.isAlive()){

             if(foundWeapon()){
                 int count=0;
                 printer.print("The tides sway in your favor, you have stumbled upon a cache of weapons.\n Choose your weapon wisely:");
                 for(String weapon: keys){
                     count++;
                     System.out.printf("\t\t%s. %s%n",count,weapon);
                 }
                 System.out.print("\nChoice: ");
                 String input = read.next();
                 String selection;

                 if(input.equals("1")){
                     selection = keys.get(0);
                     character1.setWeapon(keys.get(0));
                     character1.setWeaponPower((int) weapons.get(selection));
                 }else if(input.equals("2")){
                     selection = keys.get(1);
                     character1.setWeapon(keys.get(1));
                     character1.setWeaponPower((int) weapons.get(selection));
                 }else if(input.equals("3")){
                     selection = keys.get(2);
                     character1.setWeapon(keys.get(2));
                     character1.setWeaponPower((int) weapons.get(selection));
                 }else if(input.equals("4")){
                     selection = keys.get(3);
                     character1.setWeapon(keys.get(3));
                     character1.setWeaponPower((int) weapons.get(selection));
                 }else if(input.equals("5")){
                     selection = keys.get(4);
                     character1.setWeapon(keys.get(4));
                     character1.setWeaponPower((int) weapons.get(selection));
                 }else if(input.equals("6")){
                     selection = keys.get(5);
                     character1.setWeapon(keys.get(5));
                     character1.setWeaponPower((int) weapons.get(selection));
                 }else{

                 }
                 character1.attackEnemy(character2);
             }else {
                 character1.attackEnemy(character2);
             }
             if(foundWeapon()){
                 String enemySelection = keys.get(random.nextInt(keys.size()));
                    character2.setWeapon(enemySelection);
                    character2.setWeaponPower((int) weapons.get(enemySelection));
             }else {
                 character2.attackEnemy(character1);
             }
         }

    }
    private boolean foundWeapon(){
        Random random = new Random();

        if((random.nextInt(1 + 10)%9)==0){
            return true;
        }else{
            return false;
        }
    }



}

