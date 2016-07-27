import java.io.*;

public class WriteTestScores {

  public static void main (String[] args) throws IOException{

    double[] grade = {70, 75, 80, 85, 90}; //array to write to file

    try{
      TestScores[] test = new TestScores[1];


      //create the stream obj
      FileOutputStream outStream = new FileOutputStream("Grades.dat");
      ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
      System.out.println("Writing the grades to file");

      //write the serialized objects to the file and display them
      for (int i = 0; i < test.length; i++){
      test[i] = new TestScores(grade);
      objectOutputFile.writeObject(test[i]);
      System.out.println(test[i]);
      System.out.println("Serializing object #" + i);
    }

    System.out.print("Done.\n");

    //close file
    objectOutputFile.close();
    }
    catch (IllegalArgumentException e){
      System.out.println("Invalid score: " + e.getMessage());
    }
    catch (IOException e){
      System.out.println("Error: " + e.getMessage());
    }

  }
}
