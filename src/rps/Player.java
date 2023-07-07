
package rps;
import java.util.Random;
public class Player {
    public String choice;
    public String name;
    Player(String PlayerName){
        name = PlayerName;
    }


    public void chooseRandom(String[] choices) {
        Random rand = new Random();
        choice = choices[rand.nextInt(3)];
    }
    public void choose(Byte number,String[] choices){
        choice = choices[number];
    }

}
