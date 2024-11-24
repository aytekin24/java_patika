import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int matematik,fizik,turkce,kimya,muzik,dersSayisi;
        double ortalama,toplam;

        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        matematik=input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik=input.nextInt();

        dersSayisi=0;
        toplam=0;
        if(0<=matematik && matematik<=100){
            toplam += matematik;
            dersSayisi +=1;
        }else{
            System.out.println("Matematik ders notunuz geçersizdir.Ortalamaya katılmamıştır.");
        }
        if(0<=fizik && fizik<=100){
            toplam += fizik;
            dersSayisi +=1;
        }else{
            System.out.println("Fizik ders notunuz geçersizdir.Ortalamaya katılmamıştır.");
        }
        if(0<=turkce && turkce<=100){
            toplam += turkce;
            dersSayisi +=1;
        }else{
            System.out.println("Turkçe ders notunuz geçersizdir.Ortalamaya katılmamıştır.");
        }
        if(0<=kimya && kimya<=100){
            toplam += kimya;
            dersSayisi +=1;
        }else{
            System.out.println("Kimya ders notunuz geçersizdir.Ortalamaya katılmamıştır.");
        }
        if(0<=muzik && muzik<=100){
            toplam += muzik;
            dersSayisi +=1;
        }else{
            System.out.println("Müzik ders notunuz geçersizdir.Ortalamaya katılmamıştır.");
        }
       
        ortalama=(toplam)/dersSayisi;
        if(ortalama>=55){
            System.out.println("Sınıfı Geçtiniz");
        }else{
            System.out.println("Sınıfta Kaldınız.");
        }
        System.out.println("Ortalamanız: "+ortalama);

    }
}
