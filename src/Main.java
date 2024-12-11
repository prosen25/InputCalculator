import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        int average = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String stringInput = scanner.nextLine();

            // If the user entered any character exit the loop, display sum and average
            try {

                int doubleInput = Integer.parseInt(stringInput);
                sum += doubleInput;
                counter++;
            } catch (Exception ex) {
                break;
            }
        }

        average = Math.round((float) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}