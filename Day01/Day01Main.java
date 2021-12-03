package Day01;

import java.io.File;
import java.io.FileNotFoundException;

public class Day01Main {
    public static void main(String[] args) throws FileNotFoundException {
    
    File file = new File("Day01/day01.txt");

    Day01 day01 = new Day01();
    day01.PartOne(file);
    day01.PartTwo(file);
    }
}
