public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course courseSoz1, Course course2,
            Course courseSoz2, Course course3, Course coursesoz3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.00;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int sozNot1, int note2, int sozNot2, int note3, int sozNot3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (sozNot1 >= 0 && sozNot1 <= 100) {
            this.course1.sozNot = sozNot1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (sozNot2 >= 0 && sozNot2 <= 100) {
            this.course2.sozNot = sozNot2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
        if (sozNot3 >= 0 && sozNot3 <= 100) {
            this.course3.sozNot = sozNot3;
        }
    }

    void isPass() {
        this.avarage = (((this.course1.note * 0.8) + (this.course1.sozNot * 0.20))
                + ((this.course2.note * 0.80) + (this.course2.sozNot * 0.20))
                + ((this.course3.note * 0.80) + (this.course3.sozNot * 0.20))) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldınız.");
            this.isPass = false;
        }
        printNote();
    }
    void printNote() {
        System.out.println(course1.name + " Notu:" + course1.note);
        System.out.println(course1.name + " Sözlü Notu:" + course1.sozNot);
        System.out.println(course2.name + " Notu:" + course2.note);
        System.out.println(course2.name + " Sözlü Notu:" + course2.sozNot);
        System.out.println(course3.name + " Notu:" + course3.note);
        System.out.println(course3.name + " Sözlü Notu:" + course3.sozNot);

        System.out.println("Ortalamanız: " + this.avarage);
        System.out.println("=====================");
    }
}
