

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    try ( 
      DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));
    ) {
      // Write student test scores to the file
        for (int i = 1; i <= 100; i++){
          int min = 0;
          int max = 100;
          int randomNum;
          randomNum = (int)(Math.random() * (max - min + 1) + min);
          output.write(randomNum);
        }
    }

    try (  DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02.dat"));
    ) {
      int value;
      while ((value = input.read()) != -1)
        System.out.print(value + " ");
    }
  }
}
