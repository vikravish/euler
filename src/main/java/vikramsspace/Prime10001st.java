package vikramsspace;

public class Prime10001st {
    public static void main(String[] args) {
        System.out.println(prime10001st(0));
    }

    public static int prime10001st(int k){
        int count = 0;
        for (int i = 1; count <= 10001; i++){
            for(int j = 0; j < i; j++){
                if ((j%i) != 0){
                    continue;
                }else if(j == i-1){
                    count+=1;
                if(count == 10001){
                    return i;
                }
                }
            }
        }
        return 0;
    }
}
