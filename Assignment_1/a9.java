package Assignment_1;

public class a9 {
    public static void rotateArray(int[] arr, int k) {
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotateArray(arr, k);

        System.out.println("\nRotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
