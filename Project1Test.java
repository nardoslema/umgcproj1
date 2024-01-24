/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 01| 23| 24
 *This class is my test class that tests the class project1
 */
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Project1Test {

    Player playerOne = new Player("Nard",new Height(5,8),23);
    Player playerTwo = new Player("Jhonny",new Height(6,1),25);
    Player playerThree = new Player("mike",new Height(6,0),26);

    ArrayList<Player> playersList = new ArrayList<>();
    //testing my tallest player method
    @Test
    public void tallestPlayer() {
        Project1 projectOneee = new Project1();
        playersList.add(playerOne);
        playersList.add(playerTwo);
        playersList.add(playerThree);
        Assert.assertEquals(projectOneee.tallestPlayer(playersList, 24), playerOne);

    }
}