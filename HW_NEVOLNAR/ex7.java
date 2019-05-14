package HW_NEVOLNAR;

import java.util.Arrays;

public class ex7 {
    public static boolean isP(int a, int[]mas, int ll){
        if(a<3){
            return true;
        }
        int r=(int)Math.sqrt(a);
        for(int b=0;b<ll;++b){
            if(a%mas[b]==0){
                return false;
            }
            if(mas[b]>r){
                return true;
            }
        }
        return true;
    }

    public static void main(String[]args){
        final int[]mas=new int[100];
        int l=2;
        for(int i=0;i<mas.length;++i){
            mas[i]=l++;
            while(!isP(l,mas,i)){
                l++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
