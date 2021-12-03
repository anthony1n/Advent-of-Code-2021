package Day01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Day01 {

    public static void main(String[] args) throws FileNotFoundException {
        
        int numberOfIncreases = 0;
        int sumOfIncreases = 0;
        List<Integer> list = new ArrayList<Integer>();

        Scanner scanner = new Scanner(new FileInputStream("Day01/day01.txt"));

        // Populate list with numbers from txt file
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        // Count number of increases between the numbers
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                numberOfIncreases +=1;
            }
        }

        // Count number of moving sum increases with 3 numbers
        // Compare first set of 3 sums with next set of 3 sums
        for (int i = 0; i < list.size() - 3; i++) {
            int sum = list.get(i) + list.get(i + 1) + list.get(i + 2);
            int sum2 = list.get(i + 1) + list.get(i + 2) + list.get(i + 3);

            if (sum2 > sum) {
                sumOfIncreases += 1;
            }
        }
        
        // Display list of numbers
        System.out.println("Day 01 Part 1, The number of increases: " + numberOfIncreases);
        System.out.println("Day 01 Part 2, The sum number of increases: " + sumOfIncreases);
    }
}
