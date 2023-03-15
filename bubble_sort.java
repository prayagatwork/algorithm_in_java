public class bubble_sort{
    
    public static void bsort(int ary[]){
        for(int i=0;i<ary.length;i++){
            for(int j=0;j<(ary.length-1);j++){
                int swap=0;
                if(ary[j]>ary[j+1]){
                    int temp=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=temp;
                    swap++;
                }
                
            }
        }
        for(int i=0;i<ary.length;i++){
            System.out.print(" "+ ary[i]);
        }
    }
    public static void main(String args[]){
        int ary[]={3,5,2,7,6};
        System.out.println(ary.length);
        System.out.println();
        bsort(ary);
    }
}