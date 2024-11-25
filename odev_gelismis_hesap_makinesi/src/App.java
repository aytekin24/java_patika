import java.util.Scanner;

public class App {
    
        static int sum(int a, int b) {
            int result = a + b;
            System.out.println("Toplam: " + result);
            return result;
        }
    
        static int cikar(int a, int b) {
            int result = a - b;
            System.out.println("Çıkarma: " + result);
            return result;
        }
    
        static int carpma(int a, int b) {
            int result = a * b;
            System.out.println("Çarpım: " + result);
            return result;
        }
    
        static double bolme(double a, double b) {
            if (b == 0) {
                System.out.println("Bir Sayı sıfıra bölünemez. Lütfen tekrar deneyiniz.");
                return 0;
            }
            double result = a / b;
            System.out.println("Bölüm: " + result);
            return result;
        }
    
        static int us(int a, int b) {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(a + " sayısının " + b + ". kuvvetinin değeri: " + result);
            return result;
        }
    
        static int mod(int a, int b) {
            int result = a % b;
            System.out.println("Mod değeri: " + result);
            return result;
        }
    
        static void dikdortgen(int a, int b) {
            int alan = a * b;
            int cevre = 2 * (a + b);
            System.out.println("Alan: " + alan + "\n" + "Çevre: " + cevre);
        }
    
        public static void main(String[] args) throws Exception {
    
            Scanner input = new Scanner(System.in);
            int select;
            String menu = "1-Toplama İşlemi\n" + "2-Çıkarma İşlemi\n" + "3-Çarpma İşlemi\n" + "4-Bölme İşlemi\n"
                    + "5-Üslü Sayı Hesaplama\n" + "6-Mod Alma\n" + "7-Dikdörtgen Alan ve Çevre Hesabı\n" + "0-Çıkış Yap";
            System.out.println(menu);
            while (true) {
                System.out.print("Bir İşlem Seçiniz: ");
                select = input.nextInt();
                if (select == 0) { 
                    break;
                }
                System.out.print("Birinci Sayıyı Giriniz: ");
                int a = input.nextInt();
                System.out.print("İkinci Sayıyı Giriniz: ");
                int b = input.nextInt();
    
                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        cikar(a, b);
                        break;
                    case 3:
                        carpma(a, b);
                        break;
                    case 4:
                        bolme(a, b);
                        break;
                    case 5:
                        us(a,b);
                        break;
                    case 6:
                        mod(a, b);
                        break;
                    case 7:
                        dikdortgen(a, b);
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem girdiniz.");
    
                }
            }
            System.out.println("Çıkış Yaptınız.");

    }
}
