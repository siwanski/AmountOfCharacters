import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class AmountOfCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Wpisz test, a ja zliczê wystêpowanie poszczególnych liter:");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String in;
		
		try {
			in = bufferedReader.readLine();
			HashMap<Character, Integer> out = amount(in);
			System.out.println(out.keySet());
			System.out.println(out.values());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static HashMap<Character, Integer> amount(final String s){
		HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
		
		for(int i = 0; i< s.length(); i++) {
			char character = s.charAt(i);
			
			if(!characters.containsKey(character))
				characters.put(character, 1);
			else
				characters.put(character, characters.get(character) + 1);
		}
		
		return characters;
	}

}
