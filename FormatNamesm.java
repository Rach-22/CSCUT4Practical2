import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FormatNamesm {

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file. -
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        // added from here down

        // this reads file line by line using Scanner
        try{
            FileInputStream fis = new FileInputStream("inputm.txt"); //file to open
            Scanner sc = new Scanner(fis); // file to scan
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }







       // System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
