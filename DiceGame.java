/*
Name: Kunwar Vats
Student number: A00251176

Lab 3

Class DiceGame
*/
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class DiceGame
{
    //Main method
    public static void main(String[] args) {

        Die die6, die10, die20;

        System.out.println("\nCreating default die d6 with 6 sides...");

        die6 = new Die();
        die10 = new Die(10, "Tenner");
        die20 = new Die(20);

        die6.printCurrentFace();
        die10.printCurrentFace();
        die20.printCurrentFace();

        die6.roll(true);
        die10.roll(true);
        die20.roll(true);

        die10.getMax();
        make5Dice();
    }

    //Method to make 5 dice, and roll until all are one of a kind
    static public void make5Dice()
    {
        System.out.println("\n\nCreating 5 d6...");
        Die die1, die2, die3, die4, die5;
        int times = 0;

        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        die4 = new Die();
        die5 = new Die();

        Set<Integer> diceSet = new HashSet<Integer>();
        diceSet.add(die1.fetchCurrentFace());
        diceSet.add(die2.fetchCurrentFace());
        diceSet.add(die3.fetchCurrentFace());
        diceSet.add(die4.fetchCurrentFace());
        diceSet.add(die5.fetchCurrentFace());

        while (diceSet.size() > 1)
        {
            System.out.println(diceSet);

            die1.roll(false);
            die2.roll(false);
            die3.roll(false);
            die4.roll(false);
            die5.roll(false);

            diceSet.clear();
            diceSet.add(die1.fetchCurrentFace());
            diceSet.add(die2.fetchCurrentFace());
            diceSet.add(die3.fetchCurrentFace());
            diceSet.add(die4.fetchCurrentFace());
            diceSet.add(die5.fetchCurrentFace());

            times++;
            System.out.println(times);
        }

        System.out.println("\n\nIt took " + String.valueOf(times) + " rolls");
    }
}
