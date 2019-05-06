package HW_NEVOLNAR;

public class LM {

   public static void main (String[] args){
       //ex1
       int i=10;
       int ia=124;
       System.out.println(lmFac(i,ia));

   }
   //ex1
       public static int lmFac(int i, int ia){

       int minIandIA=Math.min(i,ia);
       int maxIandIY=Math.max(i,ia);
       int iz=0;
       for (int z=minIandIA;z>iz;z--){
           if((minIandIA%z==iz)&&(maxIandIY%z==iz)){
               return z;
           }
       }
       return 1;
       }




    }







