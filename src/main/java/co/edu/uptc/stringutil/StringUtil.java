package co.edu.uptc.stringutil;

public class StringUtil {
    public StringUtil(){}

    //Methods

    public String reverseString(String str){
        String reversed = "";
        for(int c = str.length() - 1; c >= 0 ; c--){
            reversed += str.charAt(c);
        }
        return reversed;
    }

    //Excercise 1
    public String reversedOddStrings(String str){
        return str.length() % 2 != 0? this.reverseString(str) : str;
    }

    //Excercise 2
    public boolean isPalindrome(String str){
        return str.compareToIgnoreCase(this.reverseString(str)) == 0;
    }

    //Excercise 3
    public char[][] genBiArray(String[] words){
        char[][] terminalLetters = new char[words.length][3];
        for(int i = 0; i < words.length; i++){
            for(int c = 0 ; c < 3; c++){
                terminalLetters[i][c] = words[i].charAt(words[i].length() - (1+c));
            }
        }
        return terminalLetters;
    }
    public boolean twoCharsArrayEqual(char[] char1, char[] char2){
        for(int i = 0; i < char1.length; i++){
            if(char1[i] != char2[i]){return false;}
        }
        return true;
    }
    public String checkRhymeEven(String[] words){
        int length = 0;
        String result = "";
        char[][] lastLetters = this.genBiArray(words);
        length = lastLetters.length % 2 == 0 ? lastLetters.length/2 : ((lastLetters.length + 1)/2) + 1;
        for(int y = 0; y < length; y+=2){
            result += this.twoCharsArrayEqual(lastLetters[y], lastLetters[y+2]) ? words[y] + " rima con " + words[y+2] : words[y] + " no rima con " + words[y+2] ;
            result += " ";
        }
        return result;
    }

    public String checkRhymeOdds(String[] words){
        int length = 0;
        String result = "";
        char[][] lastLetters = this.genBiArray(words);
        length = lastLetters.length % 2 == 0 ? lastLetters.length/2 : ((lastLetters.length + 1)/2) - 1;
        for(int y = 1; y <= length; y+=2){
            result += this.twoCharsArrayEqual(lastLetters[y], lastLetters[y+2]) ? words[y] + " rima con " + words[y+2] : words[y] + " no rima con " + words[y+2] ;
            result += " ";
        }
        return result;
    }

}
