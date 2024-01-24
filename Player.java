/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 01| 23| 24
 * This is the player class which is an immutable model of the basketball players.
 */
public class Player {
    private final String playersName;
    public final Height height;
    private final int age;
//constructor
    public Player(String playersName, Height height, int age) {
        this.playersName = playersName;
        this.height = height;
        this.age = age;
    }
    public String getPlayersName() {
        return playersName;
    }
//method to get height
    public Height getHeight() {
        return height;
    }
// method to return the age
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Player{" +
                "playersName='" + playersName + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
