package Day01;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day01 {

    public void PartOne(File file) {

        int numberOfIncreases = 0;
        List<Integer> list = new ArrayList<Integer>();

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {

            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < list.get(i + 1)) {
                    numberOfIncreases += 1;
                }
            }
        } catch (Exception e) {
        
        }
        System.out.println("Day 01 Part 1, The number of increases: " + numberOfIncreases);        
    }

    public void PartTwo(File file) {
        
        int sumOfIncreases = 0;
        List<Integer> list = new ArrayList<Integer>();

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {

            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }

            for (int i = 0; i < list.size() - 3; i++) {
                int sum = list.get(i) + list.get(i + 1) + list.get(i + 2);
                int sum2 = list.get(i + 1) + list.get(i + 2) + list.get(i + 3);

                if (sum2 > sum) {
                    sumOfIncreases += 1;
                }
            }
        } catch (Exception e) {
        
        }
        System.out.println("Day 01 Part 2, The sum number of increases: " + sumOfIncreases);  
        
    }

}
