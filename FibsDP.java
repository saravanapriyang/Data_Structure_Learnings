public class FibsDP {
    public static int fib(int[] memo,int n){
        if(memo[n]==0){
            if(n<2){
                memo[n] = n;

            }else{
                int left = fib(memo,n-1);
                int right = fib(memo,n-2);
                memo[n] = left + right;
            }
        }
        return memo[n];
    }    
    
    public static void main(String[] args) {
        int memo[] = new int[6];
        int result = fib(memo, 5);
        System.out.println(result);

    }
}
