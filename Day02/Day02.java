package Day02;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day02 {
    
    public void PartOne(File file) {
        
        int horizontalPosition = 0;
        int depthPosition = 0;

        List<String> list = new ArrayList<String>();

        try(Scanner scanner = new Scanner(new FileInputStream(file))) {
        
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }

            for (int i = 0; i < list.size(); i++) {
                String [] splitInstructions = list.get(i).split(" ");
                if (splitInstructions[0].equals("forward")) {
                    horizontalPosition += Integer.parseInt(splitInstructions[1]);
                }
                else if (splitInstructions[0].equals("up")) {
                    depthPosition -= Integer.parseInt(splitInstructions[1]);
                }
                else if (splitInstructions[0].equals("down")) {
                    depthPosition += Integer.parseInt(splitInstructions[1]);
                }
            }
        } catch (Exception e) {
            
        }
        System.out.println("Day 02 Part 1 - Horizontal: " + horizontalPosition +  ", Depth: " + depthPosition + ", Depth * Horizontal: " + horizontalPosition * depthPosition);
    }

    public void PartTwo(File file) {
        int horizontalPosition = 0;
        int depthPosition = 0;
        int aim = 0;

        List<String> list = new ArrayList<String>();

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            for (int i = 0; i < list.size(); i++) {
                String [] splitInstructions = list.get(i).split(" ");
                if (splitInstructions[0].equals("forward")) {
                    horizontalPosition += Integer.parseInt(splitInstructions[1]);
                    depthPosition += (aim * Integer.parseInt(splitInstructions[1]));
                }
                else if (splitInstructions[0].equals("up")) {
                    aim -= Integer.parseInt(splitInstructions[1]);
                }
                else if (splitInstructions[0].equals("down")) {
                    aim += Integer.parseInt(splitInstructions[1]);
                }
            }
        } catch (Exception e) {
        
        }
        System.out.println("Day 02 Part 2 - Horizontal: " + horizontalPosition +  ", Depth: " + depthPosition + ", Aim: " + aim + ", Depth * Horizontal: " + horizontalPosition * depthPosition);
    }
}
