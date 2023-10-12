package Assignment_1;

public class a2 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return n;
        }
        return n+sum(n-1);
    }
}
