package se.oscarb.testingdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PigLatinTest {

    @Test
    public void testCheckIfLowercaseAIsVowel() throws Exception {
        // Vi vill testa metoden checkIfVowel i PigLatin
        PigLatin pigLatin = new PigLatin();

        // Testa att a är en vokal
        boolean result = pigLatin.checkIfVowel("a");

        // Testa!
        // Första parametern - förväntat värde
        // Andra paramentern - faktiskt värde
        assertEquals(true, result);

    }

   @Test
   public void testCheckIfUppercaseAIsVowel() throws Exception {
       PigLatin pigLatin = new PigLatin();
       boolean result = pigLatin.checkIfVowel("A");
       assertEquals(true, result);
   }
}