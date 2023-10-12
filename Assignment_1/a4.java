package Assignment_1;

public class a4 {
    public static void main(String[] args) {
        int[] a ={3,2,5,4,1};
        int n = a.length;
        System.out.println(max(a,n));
        System.out.println(min(a,n));
    }
    public  static  int max(int[] a, int n){
        if(n==1){
            return a[0];
        }
        return Math.max(a[n-1],max(a,n-1));
    }
    public  static int min(int[] a, int n){
        if(n==1){
            return a[0];
        }
        return Math.min(a[n-1],min(a,n-1));
    }
}
