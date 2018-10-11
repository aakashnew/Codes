import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LocalDate dob = LocalDate.parse(input);
        System.out.println("Age is:" + getAge(dob));
    }

    public static int getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }

}