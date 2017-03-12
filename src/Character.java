import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;

/**
 * Created by chrisaanerud on 3/10/17.
 */

public class Character {

    private int healthPoints;
    private int attackPower;
    private String characterName;
    private String characterType;
    private String Weapon;
    private int weaponPower;
    private Random rand = new Random();




    public Character(int attackPower, String characterName, String characterType) {
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
    public int getAttackPower() {
        return attackPower;
    }

    // setAttackPower(arg)
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    //getHealth
    public int getHealthPoints() {
        return healthPoints;
    }


    //check health isAlive()
    public boolean isAlive() {
        if (healthPoints > 0) {
            return true;
        } else {
            return false;
        }
    }
    // attackEnemy()  takes arg of (Character enemy) of who we are attacking


    public void attackEnemy(Character character) {
        if (character.dodgeEnemy()) {
            System.out.println(character.getCharacterName() + " has dodged the attack!");

        } else if (character.counterAttack()) {
            setHealthPoints(this.getHealthPoints() - character.attackPower);
            System.out.println(character.getCharacterName()+" has countered the attack!");
        } else {
            character.setHealthPoints(character.getHealthPoints() - this.attackPower);
            System.out.printf("%s has taken %s damage %n Enemy health is now %s%n", character.getCharacterName(), getAttackPower(), character.getHealthPoints());

        }
    }
    // deduct health of arg character
    // this does not need to return anything but you could print something out


    //dodgeEnemy() return true of false maybe this is where we can use a random of 0 to 1
    public boolean dodgeEnemy() {
        if (rand.nextInt(1 + 10) > 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean counterAttack() {
        if (rand.nextInt(1 + 10) == 10) {
            return true;
        } else {
            return false;
        }
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getWeaponPower() {
        return weaponPower;
    }

    public void setWeaponPower(int weaponPower) {
        this.weaponPower = weaponPower;
    }
}
