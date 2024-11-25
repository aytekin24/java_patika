public class App {
    public static void main(String[] args) throws Exception {

        String[][] arr=new String[7][4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0 ||i==6){
                    arr[i][j]=" *";
                }else if(j==0){
                    arr[i][j]=" *";
                }else if(i==3 && (j==1 || j==2)){
                    arr[i][j]=" *";
                }else if(i !=3 && j==3){
                    arr[i][j]=" *";
                }else{
                    arr[i][j]="   ";
                }
            }
        }
        for(String[] row:arr){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
 

    }
}
