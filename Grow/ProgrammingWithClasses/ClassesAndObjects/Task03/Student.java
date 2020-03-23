package Grow.ProgrammingWithClasses.ClassesAndObjects.Task03;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
// номер группы, успеваемость (массив из пяти элементов). Создайте массив
// из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
    private String lastNameAndInitials;
    private int groupNumber;
    private int[] acemicPerformance;

    public Student(String lastNameAndInitials, int groupNumber, int[] acemicPerformance) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.groupNumber = groupNumber;
        this.acemicPerformance = acemicPerformance;
    }

    private static void gradeStudent(Student[] students){
        for (Student student : students){
            int acPerf = 10;
            for (int grade : student.acemicPerformance){
                if (grade < acPerf){
                    acPerf = grade;
                }
            }
            if (acPerf >= 9){
                System.out.printf("Perfect Student: %s, group: %d. %n", student.lastNameAndInitials, student.groupNumber);
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Иванов И.И.", 100, new int[]{8, 9, 10, 5, 10});
        students[1] = new Student("Петров К.Э.", 101, new int[]{7, 6, 9, 9, 8});
        students[2] = new Student("Дидро Д.Д.", 120, new int[]{1, 10,9, 10, 5});
        students[3] = new Student("Толстой Л.Н.", 100, new int[]{9, 4, 8, 6, 9});
        students[4] = new Student("Пушкин А.С.", 100, new int[]{10, 10, 10, 10});
        students[4] = new Student("Бах И.С.", 105, new int[]{6, 9, 10, 5, 10});
        students[5] = new Student("Амадей-Моцарт В.Л.", 100, new int[]{8, 9, 9, 5, 9});
        students[6] = new Student("Гоголь Н.В.", 111, new int[]{8, 9, 10, 5, 6});
        students[7] = new Student("Байрон Д.Г.", 115, new int[]{8, 9, 9, 8, 8});
        students[8] = new Student("Шаляпин Ф.И.", 120, new int[]{8, 9, 3, 5, 7});
        students[9] = new Student("Рюрикович С.И.", 100, new int[]{10, 9, 10, 9, 9});

        gradeStudent(students);
    }
}