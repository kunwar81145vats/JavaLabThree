
/*
Name: Kunwar Vats
Student number: A00251176

Lab 3

Class Die
*/
import java.util.Random;


class Die {


  private int numberOfFaces;
  private String dieName;
  private int currentFace;
  private Random generator = new Random();

  //Constructor to create default 6 sided die
  public Die()
  {
      numberOfFaces = 6;
      dieName = "d6";
      currentFace = 1 + (int)(Math.random()*numberOfFaces);
  }

  //Constructor to create a die
  //Parameters: faces, name
  public Die(int faces, String name)
  {
      System.out.println(String.format("\nCreating a die with name %s with %d sides...", name, faces));
      numberOfFaces = faces;
      dieName = name;
      currentFace = 1 + (int)(Math.random()*numberOfFaces);

  }

  //Constructor to create a die
  //Parameters: faces
  public Die(int faces)
  {
      System.out.println(String.format("\nCreating a die with name d%d with %d sides...", faces, faces));
      numberOfFaces = faces;
      dieName = "d" + String.valueOf(faces);
      currentFace = 1 + (int)(Math.random()*numberOfFaces);

  }

  //Method to print number of faces
  public void printCurrentFace()
  {
      System.out.println(String.format("\nCurrent side up of %s is %d...", dieName, currentFace));
  }

  //Method to fetch current face
  //Return: currentFace
  public int fetchCurrentFace()
  {
      return currentFace;
  }

  //Method to print maximum number on a die
  public void getMax()
  {
      System.out.println(String.format("\nMaximum side of %s is %d.", dieName, numberOfFaces));
  }

  //Method to roll a die
  //Parameters: printDetail, to decide whether to print description
  public void roll(Boolean printDetail)
  {

      currentFace = 1 + (int)(Math.random()*numberOfFaces);
      if (printDetail)
      {
            System.out.println("\nRolling " + dieName + "...");
            System.out.println("\nNow current side up is " + String.valueOf(currentFace));
      }
  }

}
