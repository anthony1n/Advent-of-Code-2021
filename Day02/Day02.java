package Day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) throws FileNotFoundException {
        
        int horizontalPosition = 0;
        int depthPosition = 0;
        int aim = 0;

        List<String> list = new ArrayList<String>();
        
        Scanner scanner = new Scanner(new FileInputStream("Day02/day02.txt"));
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        // Split text from instructions and value 
        for (int i = 0; i < list.size(); i++) {
            String [] splitInstructions = list.get(i).split(" ");
            if (splitInstructions[0].equals("forward")) {
                horizontalPosition += Integer.parseInt(splitInstructions[1]);
            } 

            else if (splitInstructions[0].equals("up")) {
                depthPosition -= Integer.parseInt(splitInstructions[1]);
                aim -= Integer.parseInt(splitInstructions[1]);
            } 

            else if (splitInstructions[0].equals("down")) {
                depthPosition += Integer.parseInt(splitInstructions[1]);
                aim += Integer.parseInt(splitInstructions[1]);
            }

        }
        System.out.println("Day 02 Part 1 Horizontal: " + horizontalPosition +  "\nDepth: " + depthPosition + 
                            "\nDepth * Horizontal: " + horizontalPosition * depthPosition);
    
    }
        
}

