public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(
                    "5000X" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "John";
                        case 4 -> "Tim";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1999",
                    "Java Master class"
            );
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/02/1998", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/03/1995", "Java Masterclass");

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
       // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829")

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());

    }
}
