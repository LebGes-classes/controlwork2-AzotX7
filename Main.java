import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сколько студентов участвуют в контрольных работах:");
        int numberStudent=scanner.nextInt();
        List<Student> students = generateStudents(numberStudent);

        for (int i = 0; i < numberStudent; i++) {
            for (Student student : students) {
                if (new Random().nextBoolean()) {
                    student.ProgrammingWork();
                } else {
                    student.ElectricalEngineeringWork();
                }
            }

            System.out.println("После работы " + (i + 1) + ": ");
            printStudentStates(students);

            Collections.sort(students, (s1, s2) -> Integer.compare(s2.rating, s1.rating));
            int numMacBooks = (int) (students.size() * 0.25);
            System.out.println("Эти студенты получают макбук: ");
            for (int j = 0; j < numMacBooks; j++) {
                students.get(j).outputRating();
            }
            System.out.println("\n\n");
        }
    }

    private static List<Student> generateStudents(int numStudents) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            if (random.nextBoolean()) {
                students.add(new ITIS());
            } else {
                students.add(new IVMIIT());
            }
        }

        return students;
    }

    private static void printStudentStates(List<Student> students) {
        for (Student student : students) {
            if (student instanceof ITIS) {
                System.out.println("Cтудент ИТИСа: " + student.rating);
            } else if (student instanceof IVMIIT) {
                System.out.println("Студент ИМВИиТА: " + student.rating);
            }
        }

    }
}
