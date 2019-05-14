package HW_NEVOLNAR;

public class ex6 {
    public static void main(String[]args){

        int[]ab=new int[20];
        for(int i=0;i<ab.length;i++){
            if(i<2){
                ab[i]=1;
            }
            else{
                ab[i]=ab[i-2]+ab[i-1];
            }
            System.out.println(ab[i]+"");
        }
    }
}
