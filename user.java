import java.util.Scanner;

public class User {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of subjects:"):
    int numSubjects = scanner.nextInt();
    double[] marks = new double[numSubjects];
    double totalMarks = 0;
}
    for (int i = 0; i < numSubjects; i++) {
        System.out.println("Enter marks for subject :");
        marks[i] = scanner.nextDouble();
        totalMarks += marks[i];

}
}