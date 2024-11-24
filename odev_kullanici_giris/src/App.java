import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String userName, password, password1;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Parolanızı giriniz: ");
        password = input.nextLine();

        if (userName.equals("deniz")) {
            if (password.equals("1234")) {
                System.out.print("Kullanıcı girişi başarılı");
            } else {
                System.out.println("Şifreniz yanlış.\nŞifrenizi yeniden oluşturmak ister misiniz?");
                System.out.println("1-Şifremi sıfırlamak istiyorum.\n2-Şifremi değiştirmek istemiyorum");
                select = input.nextInt();
                if (select == 1) {
                    System.out.print("Yeni şifrenizi giriniz:");
                    Scanner in=new Scanner(System.in);
                    password1 = in.nextLine();
                    if (password1.equals("1234")) {
                        System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }

                } else if (select == 2) {
                    System.out.println("Şifre değiştirilmedi.");
                } else {
                    System.out.println("Lütfen geçerli bir sayı giriniz.");
                }
            }
        } else {
            System.out.println("Kullanıcı adınızı yanlış girdiniz. Lütfen tekrar deneyiniz.");
        }

    }
}
