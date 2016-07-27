import java.io.*;

public class ReadTestScores {

  public static void main (String[] args) throws IOException{

    //create an array
    TestScores[] test = new TestScores[1];

    try
    {
      //create the stream objs
      FileInputStream inStream = new FileInputStream("Grades.dat");
      ObjectInputStream objectInputFile = new ObjectInputStream(inStream);
      //System.out.println("Reading grades from file");

      //read and deserialize the objs and display them
      for(int i = 0; i < test.length; i++){
        test[i] = (TestScores) objectInputFile.readObject();
        System.out.println(test[i]);
      }

      //close file
      objectInputFile.close();

    }
    catch (Exception e)
    {
       System.out.println("Error - " + e.getMessage());
    }
  }
}
