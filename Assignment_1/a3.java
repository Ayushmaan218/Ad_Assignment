package Assignment_1;

public class a3 {
    public static void main(String[] args) {
        int a[]={2,3,1,4,5};int max=a[0];int min = a[0];
        for (int j : a) {
            if (j > max) {
                max = j;
            }
            if(j<min){
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
