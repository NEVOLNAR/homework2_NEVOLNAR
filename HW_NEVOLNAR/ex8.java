package HW_NEVOLNAR;

public class ex8 {
    public int [][]a=new int[8][8];
    int az=0;
    int ao=1;
    public ab(){
        for(int y=0;y<a.length;y++){
            if(y%2==az){
                a[y][az]=az;
            }
            else{
                a[y][az]=1;
            }
            for(int j=1;j<a[y].length;j++){
                if(getOpposite(a[y][j-1])!=-1){
                    a[y][j]=getOpposite(a[y][j-1]);
                }
                else{
                    System.exit(ao);
                }

            }
        }
        public void print(){
            for(int i=0;i<a.length;i++,System.out.println()){
                for(int j=0;j<a[i].length;j++){
                    System.out.print(a[i][j] + " ");
                }

            }
        }
        private int getOpposite(int a){
            if(a==0){
                return 1;
            }
            else{
                if(a==1){
                    return -1;
                    
                }
            }

        }
    }







    public static void main(String[]args){


    }
}
