import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Szymon Iwa�ski
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
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount2() {
		String text = "To jest baaaaaaaaaaaaaaaaaaaaaaaaaaaaaardzo d�uuuuuuuuuuuuuuuuuuugi test";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount3() {
		String text = "Ala ma kota";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount4() {
		String text = "St�, z powy�amywanymi nogami";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount5() {
		String text = "A by�o to tak - bociana drapa� szpak, a potem by�a zmiana, i szpak drapa�"
				+ "bociana, a potem by�y jeszcze dwie zmiany. Ile razy szpak by� drapany???";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount6() {
		String text = "My�la� indyk o niedzieli, a w sobot� �ep mu �cieli!";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount7() {
		String text = "Eugeniusz Brz�czyszczykiewicz";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount8() {
		String text = "Litwo! Ojczyzno moja! ty jeste� jak zdrowie."
				+ "Ile ci� trzeba ceni�, ten tylko si� dowie,"
				+ "Kto ci� straci�. Dzi� pi�kno�� tw� w ca�ej ozdobie"
				+ "Widz� i opisuj�, bo t�skni� po tobie.";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount9() {
		String text = "Panno �wi�ta, co jasnej bronisz Cz�stochowy"
				+ "I w Ostrej �wiecisz Bramie! Ty, co gr�d zamkowy"
				+ "Nowogr�dzki ochraniasz z jego wiernym ludem!"
				+ "Jak mnie dziecko do zdrowia powr�ci�a� cudem"
				+ "(Gdy od p�acz�cej matki pod Twoj� opiek�"
				+ "Ofiarowany, martw� podnios�em powiek�"
				+ "I zaraz mog�em pieszo do Twych �wi�ty� progu"
				+ "I�� za wr�cone �ycie podzi�kowa� Bogu),"
				+ "Tak nas powr�cisz cudem na Ojczyzny �ono."
				+ "Tymczasem przeno� moj� dusz� ut�sknion�"
				+ "Do tych pag�rk�w le�nych, do tych ��k zielonych,"
				+ "Szeroko nad b��kitnym Niemnem rozci�gnionych;"
				+ "Do tych p�l malowanych zbo�em rozmaitem,"
				+ "Wyz�acanych pszenic�, posrebrzanych �ytem;"
				+ "Gdzie bursztynowy �wierzop, gryka jak �nieg bia�a,"
				+ "Gdzie panie�skim rumie�cem dzi�cielina pa�a,"
				+ "A wszystko przepasane, jakby wst�g�, miedz�"
				+ "Zielon�, na niej z rzadka ciche grusze siedz�.";
		assertEquals("Test przebieg� prawid�owo", amount(text), AmountOfCharacters.amount(text));
	}
	
	@Test
	public void testAmount10() {
		String[] text = {"test", "test testowy", "test testowany", "TO JEST TYLKO JEDEN PROSTY TEST", "TesT", "", "56835256", "     ", null};
		for (int i = 0; i < text.length; i++) assertEquals("Test przebieg� prawid�owo", amount(text[i]), AmountOfCharacters.amount(text[i]));
	}
}
