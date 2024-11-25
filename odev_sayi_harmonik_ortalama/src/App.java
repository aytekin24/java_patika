import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        double[] list =new double[10];
        double sum=0.0;
        for(int i=0;i<list.length;i++){
            list[i]=i+1;
        }
        for(int i=0;i<list.length;i++){
            sum += 1/list[i] ;
        }
        
        double avarage=list.length/sum;
        System.out.println("Harmonik Ortalama: "+avarage);
    }
}
