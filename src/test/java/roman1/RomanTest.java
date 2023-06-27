package roman1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanTest {
	
	@Test
	void should_arabic_number_one_return_I() {
	    Assertions.assertEquals("I", Roman.arabicToRomanNumber(1));
	}
	
	@Test
	void should_arabic_number_two_return_II() {
	    Assertions.assertEquals("II", Roman.arabicToRomanNumber(2));
	}
	
	@Test
	void should_arabic_number_three_return_III() {
	    Assertions.assertEquals("III", Roman.arabicToRomanNumber(3));
	}
	
	@Test
	void should_arabic_number_five_return_V() {
	    Assertions.assertEquals("V", Roman.arabicToRomanNumber(5));
	}
	
	@Test
	void should_arabic_number_six_return_VI() {
	    Assertions.assertEquals("VI", Roman.arabicToRomanNumber(6));
	}
	
	@Test
	void should_arabic_number_seven_return_VII() {
	    Assertions.assertEquals("VII", Roman.arabicToRomanNumber(7));
	}
	
	@Test
	void should_arabic_number_eight_return_VIII() {
	    Assertions.assertEquals("VIII", Roman.arabicToRomanNumber(8));
	}
	
	@Test
	void should_arabic_number_ten_return_X() {
	    Assertions.assertEquals("X", Roman.arabicToRomanNumber(10));
	}
	
	@Test
	void should_arabic_number_twanty_three_return_XXIII() {
	    Assertions.assertEquals("XXIII", Roman.arabicToRomanNumber(23));
	}
	
	@Test
	void should_arabic_number_thirty_return_XXX() {
	    Assertions.assertEquals("XXX", Roman.arabicToRomanNumber(30));
	}
	
	@Test
	void should_arabic_number_thirty_eight_return_XXXVIII() {
	    Assertions.assertEquals("XXXVIII", Roman.arabicToRomanNumber(38));
	}
	
	@Test
	void should_arabic_number_fifty_return_L() {
	    Assertions.assertEquals("L", Roman.arabicToRomanNumber(50));
	}
	
	@Test
	void should_arabic_number_seventy_eight_return_L() {
	    Assertions.assertEquals("LXXVIII", Roman.arabicToRomanNumber(78));
	}
	
	@Test
	void should_arabic_number_eighty_five_return_LXXXV() {
	    Assertions.assertEquals("LXXXV", Roman.arabicToRomanNumber(85));
	}
	
	@Test
	void should_arabic_number_378_return_CCCLXXVIII() {
	    Assertions.assertEquals("CCCLXXVIII", Roman.arabicToRomanNumber(378));
	}
	
	@Test
	void should_arabic_number_3888_return_MMMDCCCLXXXVIII() {
	    Assertions.assertEquals("MMMDCCCLXXXVIII", Roman.arabicToRomanNumber(3888));
	}
	
	@Test
	void should_arabic_number_959_return_CMLIX() {
	    Assertions.assertEquals("CMLIX", Roman.arabicToRomanNumber(959));
	}
	
	@Test
	void should_arabic_number_3999_return_MMMCMXCIX() {
	    Assertions.assertEquals("MMMCMXCIX", Roman.arabicToRomanNumber(3999));
	}
	
	@Test
	void should_arabic_number_3888_return_MMMDCCCLXXXVIII_new() {
	    Assertions.assertEquals("MMMDCCCLXXXVIII", Roman.arabicToRomanNumber(3888));
	}
	
	@Test
	void should_arabic_number_959_return_CMLIX_new() {
	    Assertions.assertEquals("CMLIX", Roman.arabicToRomanNumber(959));
	}
	
	@Test
	void should_arabic_number_3999_return_MMMCMXCIX_new() {
	    Assertions.assertEquals("MMMCMXCIX", Roman.arabicToRomanNumber(3999));
	}


}
