package Assignment_1;

public class a7 {
    public static void main(String[] args) {
        int a=0; int b=1;int c=0;
        for (int i=0;i<10;i++){
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
