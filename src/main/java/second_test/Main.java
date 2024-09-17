package second_test;
public class Main {
    public static void main(String[] args) {
        SubjectGrades mathGrades = new SubjectGrades("Mathematics");

        mathGrades.hasMap("Petr", 5);
        mathGrades.hasMap("Ivan", 4);
        mathGrades.hasMap("Nazar", 2);

        System.out.println(mathGrades);


        double average = mathGrades.calculateAverage();
        System.out.println("Average Grade: " + average);
    }
}

