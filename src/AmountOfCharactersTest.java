import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class AmountOfCharactersTest {
	
	public static HashMap<Character, Integer> amount(String s){
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

	@Test
	public void testAmount1() {
		String text = "To jest test";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount2() {
		String text = "To jest baaaaaaaaaaaaaaaaaaaaaaaaaaaaaardzo d³uuuuuuuuuuuuuuuuuuugi test";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount3() {
		String text = "Ala ma kota";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount4() {
		String text = "Stó³, z powy³amywanymi nogami";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount5() {
		String text = "A by³o to tak - bociana drapa³ szpak, a potem by³a zmiana, i szpak drapa³"
				+ "bociana, a potem by³y jeszcze dwie zmiany. Ile razy szpak by³ drapany???";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount6() {
		String text = "Myœla³ indyk o niedzieli, a w sobotê ³ep mu œcieli!";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount7() {
		String text = "Eugeniusz Brzêczyszczykiewicz";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount8() {
		String text = "Litwo! Ojczyzno moja! ty jesteœ jak zdrowie."
				+ "Ile ciê trzeba ceniæ, ten tylko siê dowie,"
				+ "Kto ciê straci³. Dziœ piêknoœæ tw¹ w ca³ej ozdobie"
				+ "Widzê i opisujê, bo têskniê po tobie.";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount9() {
		String text = "Panno Œwiêta, co jasnej bronisz Czêstochowy"
				+ "I w Ostrej œwiecisz Bramie! Ty, co gród zamkowy"
				+ "Nowogródzki ochraniasz z jego wiernym ludem!"
				+ "Jak mnie dziecko do zdrowia powróci³aœ cudem"
				+ "(Gdy od p³acz¹cej matki pod Twoj¹ opiekê"
				+ "Ofiarowany, martw¹ podnios³em powiekê"
				+ "I zaraz mog³em pieszo do Twych œwi¹tyñ progu"
				+ "Iœæ za wrócone ¿ycie podziêkowaæ Bogu),"
				+ "Tak nas powrócisz cudem na Ojczyzny ³ono."
				+ "Tymczasem przenoœ mojê duszê utêsknion¹"
				+ "Do tych pagórków leœnych, do tych ³¹k zielonych,"
				+ "Szeroko nad b³êkitnym Niemnem rozci¹gnionych;"
				+ "Do tych pól malowanych zbo¿em rozmaitem,"
				+ "Wyz³acanych pszenic¹, posrebrzanych ¿ytem;"
				+ "Gdzie bursztynowy œwierzop, gryka jak œnieg bia³a,"
				+ "Gdzie panieñskim rumieñcem dziêcielina pa³a,"
				+ "A wszystko przepasane, jakby wstêg¹, miedz¹"
				+ "Zielon¹, na niej z rzadka ciche grusze siedz¹.";
		assertEquals("Test przebieg³ prawid³owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount10() {
		String[] text = {"test", "test testowy", "test testowany", "TO JEST TYLKO JEDEN PROSTY TEST", "TesT", "", "56835256", "     ", null};
		for (int i = 0; i < text.length; i++) assertEquals("Test przebieg³ prawid³owo", amount(text[i]), AmountOfCharacters.amount(text[i]));
	}
}
