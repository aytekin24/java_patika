import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");

        sicaklik=input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(5<=sicaklik && sicaklik<=25){
            if(sicaklik<10){
                System.out.println("Sinemaya gidebilirsin.");
            }
            if(sicaklik>=10 && sicaklik<=15){
                System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
            }      
            if(sicaklik>15 && sicaklik<=25){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
          } else{ 
            System.out.println("Yüzmeye gidebilirsiniz.");

        }
    }
}
