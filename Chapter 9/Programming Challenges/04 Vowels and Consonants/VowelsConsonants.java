public class VowelsConsonants
{
    private String str;      // The String object.
    
    /**
        The constructor sets a string to the object
        @param inputStr The input string
     */
    public VowelsConsonants(String inputStr)
    {
        this.str = inputStr;
    }

    /**
        The getVowel method returns the number of vowels
        in the string
        @return The number of vowels in the string
     */
    public int getVowel()
    {
        // A variable to keep track of the number of vowels.
        int numVowels = 0;

        // Extract the string into a char array.
        char[] characters = str.toCharArray();

        // Check if the character is a vowel.
        for (char ch : characters)
        {
            switch (Character.toUpperCase(ch))
            {
                case 'A':
                case 'E':
                case 'U':
                case 'O':
                case 'I':
                    numVowels++;
            }
        }

        // Return the number of vowels.
        return numVowels;
    }

    /**
        The getConsonanats method returns the number of consonants
        in the string
        @return The number of consonants in the string
     */
    public int getConsonanats()
    {
        // A variable to keep track of the number of consonants
        // in the string.
        int numConsonants = 0;

        // Extract the string into a char array.
        char[] characters = str.toCharArray();

        // Check for the consonants in the string.
        for (char ch : characters)
        {
            if (Character.isLetter(ch) && 
                "AEUOI".indexOf(Character.toUpperCase(ch)) == -1)
            {
                numConsonants++;
            }
        }

        // Return the number of consonants.
        return numConsonants;
    }

    /**
        The setString method sets a string value in the object
        @param inputString The input string
     */
    public void setString(String inputString)
    {
        str = inputString;
    }
}