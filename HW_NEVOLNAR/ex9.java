package HW_NEVOLNAR;

public class ex9 {
    public static void main(String[]args){
        showArray(fillArray());
    }
    public static int [][][][][][] fillArray(){
        int [][][][][][] array = new int [2][2][2][2][2][2];
        char[] j = new char[6];
        for (int i=0;i<64;i++){
            String name="0000"+Integer.toBinaryString(i);
            j=name.substring(name.length()-6, name.length()).toCharArray();
            array[j[0]-48][j[1]-48][j[2]-48][j[3]-48][j[4]-48][j[5]-48]=i+1;

        }
        return array;
    }
    public static void showArray(int [][][][][][]array){
        for(int[][][][][]temp:array){
            for(int[][][][]temp1:temp){
                for(int[][][]temp2:temp1){
                    for(int[][]temp3:temp2){
                        for(int[]temp4:temp3){
                            for(int tmp:temp4){
                                System.out.print(tmp+"\t");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
