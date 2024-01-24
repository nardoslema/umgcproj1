/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 01| 23| 24
 *This is my Height class that represents the height of a player in feet and inches.
 */
public class Height {
 private final int inches;
 private final int feet;
//constructor
    public Height(int inches, int feet) {
        this.inches = inches;
        this.feet = feet + inches / 12;
    }
    //returns the height in total inches
    public int toInches() {
        return feet * 12 + inches;
    }
    @Override
    public String toString() {
        return "Height{" +
                "inches=" + inches +
                ", feet= " + feet +
                '}';
    }
}