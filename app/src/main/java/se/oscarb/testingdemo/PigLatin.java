package se.oscarb.testingdemo;

import java.util.ArrayList;

public class PigLatin {
    /*
    Klass som omvandlar text till rövarspråket
    Rövarspråket: för varje konsonant, lägg på ett o
    och därefter konsonanten igen
    Vokaler förblir oförändrade
     */

    // Instansvariabler
    private ArrayList<String> vowels;

    // Konstruktor
    public PigLatin() {
        vowels = new ArrayList<>();
        // Lägg till vokaler i en lista...
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");
        vowels.add("å");
        vowels.add("ä");
        vowels.add("ö");

        // Om vokalerna istället finns i Strings.xml (olika vokaler för olika språk)
        // då behöver vi en Context för att kunna hämta vår resurs (R.string.vowel)
        // Men då använder vi oss av något från Android och kan därför inte göra ett
        // lokalt enhetstest (ett test oberoende av emulator/enhet).
        // Vad man gör då är att man använder Mockito
        // se http://developer.android.com/training/testing/unit-testing/local-unit-tests.html
        

    }

    // Instansmetod
    // Kolla om tecknet är en vokal, isåfall returnera true, annars false
    public boolean checkIfVowel(String character) {
        String lowerCaseCharacter = character.toLowerCase();
        return vowels.contains(lowerCaseCharacter);
    }
}
