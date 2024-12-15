import java.util.Scanner;

public class App {
    static int dongu;

    static void desen(int x,int t) {
        System.out.print(x+" , ");
        if (x<=0) {
            System.out.print((x+5)+" , ");
            return;
        }
        desen(x-5,t);
       if(x<t){
        System.out.print((x+5)+" , ");
        return;
       } 
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        int t = n;
        desen(n,t);
    }

}
