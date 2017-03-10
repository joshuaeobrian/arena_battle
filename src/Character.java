import java.util.Random;

/**
 * Created by chrisaanerud on 3/10/17.
 */
public class Character {
    int healthPoints;
    int attackPower;
    String characterName;
    String characterType;

    public Character(int attackPower, String characterName, String characterType){
        this.healthPoints = 1000;
        this.attackPower = attackPower;
        this.characterName = characterName;
        this.characterType = characterType;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getCharacterName() {
        return characterName;
    }

    // getAttackPower()
    int getAttackPower(){
        return attackPower;
    }
    // setAttackPower(arg)
    void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    //getHealth
    int getHealthPoints(){
        return healthPoints;
    }



    //check health isAlive()
    public boolean isAlive(){
        if (healthPoints > 0){
            return true;
        }
        else{
            return false;
        }
    }
    // attackEnemy()  takes arg of (Character enemy) of who we are attacking
    public void attackEnemy(Character character){
        if(character.dodgeEnemy()){
            System.out.println(character.getCharacterName()+ " Has dodged the attack!");

        }else{
            character.setHealthPoints(character.getHealthPoints()-this.attackPower);
            System.out.printf("%s has taken %s damage %n Enemies health is now %s%n",character.getCharacterName(),getAttackPower(),character.getHealthPoints());

        }
    }
    // deduct health of arg character
    // this does not need to return anything but you could print something out


    //dodgeEnemy() return true of false maybe this is where we can use a random of 0 to 1
    public boolean dodgeEnemy(){
        Random rand = new Random();
        if (rand.nextInt(1+1)==1){
            return true;
        }
            else {
            return false;
        }
    }
}
