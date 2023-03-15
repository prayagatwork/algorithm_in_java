public class adv_pat10{
    public static void num_py(int num){
        for(int i=1;i<=num;i++){
            // spaces
            for(int j=1;j<=(num-i);j++){
                System.out.print(" ");
            }
            
        }
    }
    public static void main(String args[]){
        num_py(5);
    }
}