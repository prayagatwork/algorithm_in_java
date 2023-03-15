public class bit_clear{
    public static int clear(int n, int i){
        int mask=~(1<<i);

        return n&mask;
    }
    public static void main(String args[]){
        System.out.println(clear(10,1));

    }
}