package Day02;

import java.io.File;

public class Day02Main {
    public static void main(String[] args) {
        
        File file = new File("Day02/day02.txt");
        Day02 day02 = new Day02();
        day02.PartOne(file);
        day02.PartTwo(file);
    }
}
