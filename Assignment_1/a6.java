package Assignment_1;

public class a6 {
    public static void main(String[] args) {
        int a= 5;
        System.out.println(fact(a));
    }
    public  static int fact(int a){
        if(a==0||a==1){
            return 1;
        }
        return a*fact(a-1);
    }
}
