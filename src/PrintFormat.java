/**
 * Created by josh on 3/10/17.
 */
public class PrintFormat {

	public static void print(String str){
		for(int i =0; i <=str.length();i++){
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(100);
			}catch (Exception e){

			}
		}
		System.out.println();

	}
}
