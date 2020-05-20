import java.io.*;
import java.util.Scanner;

class MathematicOperations {

    static String[] readOperations(String fileName) throws FileNotFoundException {
        int lines = countLines(fileName);
        String[] operations = new String[lines];
        Scanner sc = new Scanner(new File(fileName));
        for (int i = 0; i < operations.length; i++) {
            operations[i] = sc.nextLine();
        }
        return operations;
    }

    static void saveOperations(ResultOperation[] mathOperations, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (ResultOperation mathOperation : mathOperations) {
            if(mathOperation != null) {
                writer.write(mathOperation.toString());
                writer.newLine();
            }
        }
        writer.close();
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        scanner.close();
        return lines;
    }
}