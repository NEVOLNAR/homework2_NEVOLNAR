package HW_NEVOLNAR;

public class ex2 {

    public static void main(String[] args) {
        //ex2
        int pi = 122;
        int z = 0;
        int zi = 10;
        int zz=0;
        while (pi > zz) {
            z = z + pi % zi;
            pi = pi / zi;


        }
        System.out.println(z);
    }
}


