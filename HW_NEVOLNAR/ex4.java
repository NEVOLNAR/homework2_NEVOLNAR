package HW_NEVOLNAR;

public class ex4 {

    public static void main (String[] args){
        System.out.println(sum(5));
    }
public static long sum(int n){

    long temp=10, result=25;
    for (int i=2;i<=n;i++){
        temp=-temp*i;
        result+=temp;
    }
    return result;
        }


}
