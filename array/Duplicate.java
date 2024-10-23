import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = src.nextInt();
        int array[] = new int[n];
        System.out.println("enter array length");
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextInt();
        }
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.println(" found duplicate element in array");
                break;
            }
        }
        System.out.println("not found duplicate element in array");
    }
}
