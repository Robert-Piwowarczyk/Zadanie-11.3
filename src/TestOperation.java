import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        final String inFileName = "MathematicalOperations.txt";
        final String outFileName = "MathematicalOperations_out.txt";
        try {
            String[] operations = MathematicOperations.readOperations(inFileName);
            System.out.println(Arrays.toString(operations));
            ResultOperation[] mathOperations = ParserOperation.parseOperations(operations);
            for (ResultOperation mathOperation : mathOperations) {
                System.out.println(mathOperation);
            }
            MathematicOperations.saveOperations(mathOperations, outFileName);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku " + inFileName);
        } catch (IOException e) {
            System.err.println("Błąd zapisu do pliku " + outFileName);
        }
    }
}
