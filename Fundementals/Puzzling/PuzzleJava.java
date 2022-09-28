import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i = 1; i <=10; i++){
            random10.add(rand.nextInt(20)+1);
        }
        return random10;
    }



    // getRandomLetterWithArray
    public String getRandomLetterWithArray() {
        // dependency injection
        Random rand = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String [] alphabet = new String[26];

        for(int i = 0; i <26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }

    // getRandomLetter
    public String getRandomLetter() {
        // dependency injection
        Random rand = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabetString.charAt(rand.nextInt(26));
        
        return String.valueOf(randomChar);
    }

    // generate password
    public String generatePassword(){
        String password = "";
        for(int i =1; i< 8;i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    // getNewPasswordSet
    public ArrayList<String> getNewPasswordSet (int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0;i<length;i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    } 
    
}