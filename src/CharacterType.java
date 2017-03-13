import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by josh on 3/10/17.
 */
public class CharacterType {
		private static List<String> enemies = Arrays.asList("Harold","Peter","Bob","Horris","Steve","Harry");
		private static List<String> characterTypes = Arrays.asList("Troll","Wizard","Dragon","Horse","Orc","Warrior");
		private static Random random = new Random();


		public static String getEnemyName(){
			String name = enemies.get(random.nextInt(enemies.size()));
			return name;
		}

		public static String geyEnemyType(){
			String type = characterTypes.get(random.nextInt(characterTypes.size()));
			return type;

		}
		public static List<String> getCharacterTypes(){
			return characterTypes;
		}
		public static String getCharacterType(int i){
			return characterTypes.get(i);
		}
}
