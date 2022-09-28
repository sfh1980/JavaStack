import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args){
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println(generator.getRandomLetter());
        System.out.println(generator.getRandomLetterWithArray());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(7));
    }
}


// testing file is where work is done/tested. it starts the app/programs. runs methods from other class files. created instance of PuzzleJava to use (test file line 6), class in PuzzleJava file to use its class and methods. 
// instance called generator calls function. the dot calls the function in the class
// 