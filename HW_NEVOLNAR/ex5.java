package HW_NEVOLNAR;

public class ex5 {

    public static void main (String []args){
        int i=0;

        for(int b=1;b<1000000;b=b+1){
            if(b/100000+(b/10000)%10+(b/1000)%10==(b/100)%10+(b/10)%10+b%10){
                i=i+1;
            }
        }
        System.out.println(i);

    }
}
