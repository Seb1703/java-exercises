package Java2_Klausurvorbereitung.Probeklausur.Lambdas;

import java.util.stream.Stream;

public class Task02 {
    public static void main(String[] args) {
        Stream<Computer> computers = Computer.getComputers()
            .map(Computer.doubleRam)
            .filter(Computer.canItRunCrysis)
            .filter(Computer.hasMinimumGhzSum(12));
    }
}
