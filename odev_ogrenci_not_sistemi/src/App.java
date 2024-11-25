public class App {
    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher("Mahmut", "TRH", "05052364754");
        Teacher t2 = new Teacher("Grahamberg", "Fizik", "036246238");
        Teacher t3 = new Teacher("Kül Yutmaz", "Biyoloji", "03624623825");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course tarihSoz = new Course("Tarih", "101", "TRH");

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course fizikSoz = new Course("Fizik", "102", "FZK");

        Course bio = new Course("Biyoloji", "103", "BIO");
        bio.addTeacher(t3);
        Course bioSoz = new Course("Biyoloji", "103", "BIO");

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, tarihSoz, fizik, fizikSoz, bio, bioSoz);
        s1.addBulkExamNote(100, 80, 198, 50, 60, 70);
        s1.isPass();

        Student s2 = new Student("Düdük Necmi", "444", "4", tarih, tarihSoz, fizik, fizikSoz, bio, bioSoz);
        s2.addBulkExamNote(20, 40, 70, 30, 60, 70);
        s2.isPass();
    }
}
