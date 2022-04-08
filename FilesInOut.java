import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws FileNotFoundException {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file. -
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        // added from here down

        System.out.println("Supply filename for input");
        Scanner in = new Scanner(System.in);
        String allFormated = null;

        try {

            String inputFileName = in.nextLine();
            File inputFile = new File(inputFileName);
            Scanner inFile = new Scanner(inputFile);
            while (inFile.hasNextLine()) {


                String names = inFile.nextLine();
                String[] details = names.split(" ");
                String fName = details[0];
                String sName = details[1];
                String date = details[2];
                String titleFName = Character.toUpperCase(fName.charAt(0)) + fName.substring(1);
                String titleSName = Character.toUpperCase(sName.charAt(0)) + sName.substring(1);
                String[] fDate = date.split("(?<=\\G..)");
                String dates = fDate[0] + "/" + fDate[1] + "/" + fDate[2] + fDate[3];
                allFormated = titleFName + " " + titleSName + " " + dates;
                System.out.println(allFormated);

            }
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage() + " not found.");
        }
        System.out.println("Supply filename for output.");


        String outputFileName = in.nextLine();
        File outputFile = new File(outputFileName);
        Scanner outFile = new Scanner(outputFile);
        if (outputFile.exists() && outputFile.isDirectory()) {
            System.out.println("Please provide a valid output file name: A directory" +
                    "with the same name exists.");
            return;
        }
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.write("File created: " + outputFile);
        printWriter.flush();
        printWriter.close();

        PrintWriter pw1 = new PrintWriter(new File(String.valueOf(outputFile)));
        pw1.write(allFormated);
        pw1.flush();
        pw1.close();






        // System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
