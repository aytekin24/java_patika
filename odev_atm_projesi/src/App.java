import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userName, password;

        Scanner input = new Scanner(System.in);
        int hak = 3;
        int select;
        int balance = 1500, price;

        while (hak > 0) {
            System.out.print("Kullanıcı Adınız:");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("1234")) {
                System.out.println("Merhaba, Patika bankasına hoşgeldiniz.");
                do{
                System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                select = input.nextInt();
               
                switch (select) {
                    case 1:
                        System.out.print("Para Miktarı: ");
                        price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para Miktarı: ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Yetersiz Bakiye");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        break;
                    
                }}while(select !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                hak--;
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kullanıcı adınız veya şifreniz hatalı. Lütfen tekrar deneyiniz.");
                    System.out.println("Kalan Hakkınız: " + hak);
                }
            }
        }
    }
}
