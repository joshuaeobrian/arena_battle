import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by josh on 3/10/17.
 */
public class CharacterType {
		private static List<String> enemies = Arrays.asList("Harold","Peter","Bob","Horris","Steve","Harry");
		private static List<String> enemyType = Arrays.asList("Troll","Wizard","Dragon","Horse","Orc");
		private static Random random = new Random();


		public static String getEnemyName(){
			String name = enemies.get(random.nextInt(enemies.size()+1));
			return name;
		}

		public static String geyEnemyType(){
			String type = enemyType.get(random.nextInt(enemyType.size()+1));
			return type;

		}
}
